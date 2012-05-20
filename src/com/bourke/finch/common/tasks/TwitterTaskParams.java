package com.bourke.finch.common.tasks;

public class TwitterTaskParams {

    public int taskType;

    public Object[] data;

    public Object result;

    public TwitterTaskParams(int taskType, Object[] data) {
        this.taskType = taskType;
        this.data = data;
    }
}
