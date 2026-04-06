package com.google.common.util.concurrent;

import java.lang.ref.WeakReference;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

@ElementTypesAreNonnullByDefault
public abstract class Striped<L> {

    public static class CompactStriped<L> extends PowerOfTwoStriped<L> {
    }

    public static class LargeLazyStriped<L> extends PowerOfTwoStriped<L> {
    }

    public static class PaddedLock extends ReentrantLock {
    }

    public static class PaddedSemaphore extends Semaphore {
    }

    public static abstract class PowerOfTwoStriped<L> extends Striped<L> {
    }

    public static class SmallLazyStriped<L> extends PowerOfTwoStriped<L> {

        public static final class ArrayReference<L> extends WeakReference<L> {
        }
    }

    public static final class WeakSafeCondition extends ForwardingCondition {

        /* renamed from: a  reason: collision with root package name */
        public final Condition f29590a;

        /* renamed from: b  reason: collision with root package name */
        public final WeakSafeReadWriteLock f29591b;

        public WeakSafeCondition(Condition condition, WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.f29590a = condition;
            this.f29591b = weakSafeReadWriteLock;
        }

        public Condition a() {
            return this.f29590a;
        }
    }

    public static final class WeakSafeLock extends ForwardingLock {

        /* renamed from: A  reason: collision with root package name */
        public final WeakSafeReadWriteLock f29592A;

        /* renamed from: z  reason: collision with root package name */
        public final Lock f29593z;

        public WeakSafeLock(Lock lock, WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.f29593z = lock;
            this.f29592A = weakSafeReadWriteLock;
        }

        public Lock a() {
            return this.f29593z;
        }

        public Condition newCondition() {
            return new WeakSafeCondition(this.f29593z.newCondition(), this.f29592A);
        }
    }

    public static final class WeakSafeReadWriteLock implements ReadWriteLock {

        /* renamed from: z  reason: collision with root package name */
        public final ReadWriteLock f29594z;

        public Lock readLock() {
            return new WeakSafeLock(this.f29594z.readLock(), this);
        }

        public Lock writeLock() {
            return new WeakSafeLock(this.f29594z.writeLock(), this);
        }
    }
}
