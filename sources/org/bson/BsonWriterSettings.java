package org.bson;

public class BsonWriterSettings {

    /* renamed from: a  reason: collision with root package name */
    public final int f43673a;

    public BsonWriterSettings(int i2) {
        this.f43673a = i2;
    }

    public int a() {
        return this.f43673a;
    }

    public BsonWriterSettings() {
        this(1024);
    }
}
