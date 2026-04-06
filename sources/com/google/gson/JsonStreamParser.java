package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class JsonStreamParser implements Iterator<JsonElement> {

    /* renamed from: A  reason: collision with root package name */
    public final Object f31681A;

    /* renamed from: z  reason: collision with root package name */
    public final JsonReader f31682z;

    /* renamed from: b */
    public JsonElement next() {
        if (hasNext()) {
            try {
                return Streams.a(this.f31682z);
            } catch (StackOverflowError e2) {
                throw new JsonParseException("Failed parsing JSON source to Json", e2);
            } catch (OutOfMemoryError e3) {
                throw new JsonParseException("Failed parsing JSON source to Json", e3);
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public boolean hasNext() {
        boolean z2;
        synchronized (this.f31681A) {
            try {
                z2 = this.f31682z.S() != JsonToken.I;
            } catch (MalformedJsonException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            } catch (IOException e3) {
                throw new JsonIOException((Throwable) e3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
