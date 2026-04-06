package org.bson.codecs.configuration;

public class CodecConfigurationException extends RuntimeException {
    public CodecConfigurationException(String str) {
        super(str);
    }

    public CodecConfigurationException(String str, Throwable th) {
        super(str, th);
    }
}
