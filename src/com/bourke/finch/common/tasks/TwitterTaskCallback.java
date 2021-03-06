package com.bourke.finch.common.tasks;

public interface TwitterTaskCallback<T, U> {
    void onSuccess(T result);
    void onFailure(U exception);
}
