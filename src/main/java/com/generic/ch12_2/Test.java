package com.generic.ch12_2;

import com.generic.ch12_1.CodingTask;
import com.generic.ch12_1.PhoneTask;
import com.generic.ch12_1.Task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by nckwon on 2017. 4. 19..
 */
public class Test {

    public static void main(String[] args) {

        PhoneTask mikePhone = new PhoneTask("Mike", "9876543");
        PhoneTask paulPhone = new PhoneTask("Paul", "1234567");
        CodingTask databaseCode = new CodingTask("db");
        CodingTask interfaceCode = new CodingTask("gui");
        CodingTask logicCode = new CodingTask("logic");

        Collection<PhoneTask> phoneTasks = new ArrayList<PhoneTask>();
        Collection<CodingTask> codingTasks = new ArrayList<CodingTask>();


        Collection<Task> mondayTasks = new ArrayList<Task>();
        Collection<Task> tuesdayTasks = new ArrayList<Task>();

        Collections.addAll(phoneTasks, mikePhone, paulPhone);
        Collections.addAll(codingTasks, databaseCode, interfaceCode, logicCode);
        Collections.addAll(mondayTasks, logicCode, mikePhone);
        Collections.addAll(tuesdayTasks, databaseCode, interfaceCode, paulPhone);

        Collection<Task> mergedTasks = MergeCollection.merge(mondayTasks, tuesdayTasks);
        System.out.println(mergedTasks.toString());
    }
}
