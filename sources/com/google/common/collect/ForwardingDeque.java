package com.google.common.collect;

import java.util.Deque;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingDeque<E> extends ForwardingQueue<E> implements Deque<E> {
    /* renamed from: a0 */
    public abstract Deque Z();

    public void addFirst(Object obj) {
        Z().addFirst(obj);
    }

    public void addLast(Object obj) {
        Z().addLast(obj);
    }

    public Iterator descendingIterator() {
        return Z().descendingIterator();
    }

    public Object getFirst() {
        return Z().getFirst();
    }

    public Object getLast() {
        return Z().getLast();
    }

    public boolean offerFirst(Object obj) {
        return Z().offerFirst(obj);
    }

    public boolean offerLast(Object obj) {
        return Z().offerLast(obj);
    }

    public Object peekFirst() {
        return Z().peekFirst();
    }

    public Object peekLast() {
        return Z().peekLast();
    }

    public Object pollFirst() {
        return Z().pollFirst();
    }

    public Object pollLast() {
        return Z().pollLast();
    }

    public Object pop() {
        return Z().pop();
    }

    public void push(Object obj) {
        Z().push(obj);
    }

    public Object removeFirst() {
        return Z().removeFirst();
    }

    public boolean removeFirstOccurrence(Object obj) {
        return Z().removeFirstOccurrence(obj);
    }

    public Object removeLast() {
        return Z().removeLast();
    }

    public boolean removeLastOccurrence(Object obj) {
        return Z().removeLastOccurrence(obj);
    }
}
