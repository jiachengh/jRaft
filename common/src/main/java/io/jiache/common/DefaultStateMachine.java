package io.jiache.common;

import io.jiache.util.Assert;

import java.util.Map;

/**
 * Created by jiacheng on 17-9-24.
 */
public class DefaultStateMachine implements StateMachine {
    private Map<String, String> storage;

    public DefaultStateMachine(Map<String, String> storage) {
        this.storage = storage;
    }

    public void commit(Entry entry) {
        Assert.checkNull(entry, "entry");
        storage.put(entry.getKey(), entry.getValue());
    }

    public String get(String key) {
        return storage.get(key);
    }
}