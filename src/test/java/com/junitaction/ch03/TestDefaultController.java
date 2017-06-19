package com.junitaction.ch03;

import com.junitaction.ch03.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertSame;

/**
 * Created by nckwon on 2017. 6. 16..
 */
public class TestDefaultController {

    private DefaultController controller;
    private Request request;
    private RequestHandler requestHandler;

    private class SampleRequest implements Request {

        private static final String DEFAULT_NAME = "Test";
        private String name;

        public SampleRequest(String name) {
            this.name = name;
        }
        public SampleRequest() {
            this(DEFAULT_NAME);
        }

        public String getName() {
            return name;
        }
    }
    private class SampleHandler implements RequestHandler {

        public Response process(Request request) throws Exception {
            return new SampleResponse();
        }
    }
    private class SampleResponse implements Response {
        private static final String NAME = "Test";
        public String getName() {
            return NAME;
        }

        public boolean equals(Object object) {
            boolean result = false;
            if (object instanceof SampleResponse) {
                result = ((SampleResponse)object).getName().equals(getName());
            }
            return result;
        }

        public int hashCode() {
            return NAME.hashCode();
        }
    }

    private class SampleExceptionHandler implements RequestHandler {

        public Response process(Request request) throws Exception {
            throw new Exception("error processing request");
        }
    }

    @Before
    public void instantiate() throws Exception {
        controller = new DefaultController();
        request = new SampleRequest();
        requestHandler = new SampleHandler();
        controller.addHandler(request, requestHandler);
    }

    @Test
    public void testAddHandler() {

        RequestHandler handler2 = controller.getHandler(request);
        assertSame("Handler we set in controller should be the same handler we " +
                "get", handler2, requestHandler);
    }

    @Test
    public void testProcessRequest() {

        Response response = controller.processRequest(request);
        assertNotNull("Must not return a null response", response);
        assertEquals(new SampleResponse(), response);
    }

    @Test
    public void testProcessRequestAnswersErrorResponse() {

        Request request = new SampleRequest("testError");
        SampleExceptionHandler handler = new SampleExceptionHandler();
        controller.addHandler(request, handler);
        Response response = controller.processRequest(request);
        assertNotNull("Must not return a null response", response);
        assertEquals(ErrorResponse.class, response.getClass());
    }

    @Test(expected = RuntimeException.class)
    public void testGetHandlerNotDefined() {
        SampleRequest request = new SampleRequest("testNotDefined");
        controller.getHandler(request);
    }

    @Test(expected = RuntimeException.class)
    public void testAddRequestDuplicateName() {
        SampleRequest request = new SampleRequest();
        SampleHandler handler = new SampleHandler();
        controller.addHandler(request, handler);
    }
}
