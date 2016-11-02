package de.lancom.systems.defer.callback;

/**
 * Executor callback.
 */
public interface ExecutorCallback {

    /**
     * Execute.
     *
     * @throws Exception if error occurs
     */
    void execute() throws Exception;

}
