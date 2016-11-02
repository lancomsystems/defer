package de.lancom.systems.defer.callback;

/**
 * Processor callback.
 *
 * @param <V> value type
 * @param <R> result type
 */
public interface ProcessorCallback<V, R> {

    /**
     * Process value.
     *
     * @param value value
     * @return result
     * @throws Exception if error occurs
     */
    R process(V value) throws Exception;

}
