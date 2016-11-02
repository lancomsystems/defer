package de.lancom.systems.defer;

/**
 * Asynchronous deferred.
 *
 * @param <T> result type
 */
public interface Deferred<T> {

    /**
     * Get promise.
     *
     * @return promise
     */
    Promise<T> getPromise();

    /**
     * Resolve promise.
     *
     * @param result result
     */
    void resolve(T result);

    /**
     * Reject promise.
     *
     * @param exception exception
     */
    void reject(Exception exception);

}
