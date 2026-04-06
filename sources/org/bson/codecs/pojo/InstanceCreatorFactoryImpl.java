package org.bson.codecs.pojo;

final class InstanceCreatorFactoryImpl<T> implements InstanceCreatorFactory<T> {

    /* renamed from: a  reason: collision with root package name */
    public final CreatorExecutable f43807a;

    public InstanceCreatorFactoryImpl(CreatorExecutable creatorExecutable) {
        this.f43807a = creatorExecutable;
    }

    public InstanceCreator a() {
        return new InstanceCreatorImpl(this.f43807a);
    }
}
