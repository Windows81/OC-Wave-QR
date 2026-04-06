package com.google.android.datatransport;

public interface TransportFactory {
    Transport a(String str, Class cls, Encoding encoding, Transformer transformer);
}
