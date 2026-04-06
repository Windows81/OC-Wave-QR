package io.realm.rx;

import android.os.Looper;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.realm.DynamicRealm;
import io.realm.DynamicRealmObject;
import io.realm.ObjectChangeSet;
import io.realm.OrderedCollectionChangeSet;
import io.realm.OrderedRealmCollectionChangeListener;
import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import io.realm.RealmModel;
import io.realm.RealmObject;
import io.realm.RealmObjectChangeListener;
import io.realm.RealmResults;
import java.util.IdentityHashMap;
import java.util.Map;

public class RealmObservableFactory implements RxObservableFactory {

    /* renamed from: e  reason: collision with root package name */
    public static final BackpressureStrategy f40382e = BackpressureStrategy.LATEST;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f40383a;

    /* renamed from: b  reason: collision with root package name */
    public ThreadLocal f40384b = new ThreadLocal<StrongReferenceCounter<RealmResults>>() {
        /* renamed from: a */
        public StrongReferenceCounter initialValue() {
            return new StrongReferenceCounter();
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public ThreadLocal f40385c = new ThreadLocal<StrongReferenceCounter<RealmList>>() {
        /* renamed from: a */
        public StrongReferenceCounter initialValue() {
            return new StrongReferenceCounter();
        }
    };

    /* renamed from: d  reason: collision with root package name */
    public ThreadLocal f40386d = new ThreadLocal<StrongReferenceCounter<RealmModel>>() {
        /* renamed from: a */
        public StrongReferenceCounter initialValue() {
            return new StrongReferenceCounter();
        }
    };

    /* renamed from: io.realm.rx.RealmObservableFactory$10  reason: invalid class name */
    class AnonymousClass10 implements FlowableOnSubscribe<RealmList<Object>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RealmList f40388a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ RealmObservableFactory f40389b;

        /* renamed from: io.realm.rx.RealmObservableFactory$10$1  reason: invalid class name */
        class AnonymousClass1 implements RealmChangeListener<RealmList<Object>> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ FlowableEmitter f40390a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass10 f40391b;

            /* renamed from: b */
            public void a(RealmList realmList) {
                if (!realmList.A()) {
                    this.f40390a.onComplete();
                } else if (!this.f40390a.isCancelled()) {
                    FlowableEmitter flowableEmitter = this.f40390a;
                    if (this.f40391b.f40389b.f40383a) {
                        realmList = realmList.s();
                    }
                    flowableEmitter.onNext(realmList);
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$10$2  reason: invalid class name */
        class AnonymousClass2 implements Runnable {

            /* renamed from: A  reason: collision with root package name */
            public final /* synthetic */ RealmChangeListener f40392A;

            /* renamed from: B  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass10 f40393B;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ Realm f40394z;

            public void run() {
                if (!this.f40394z.isClosed()) {
                    this.f40393B.f40388a.C(this.f40392A);
                    this.f40394z.close();
                }
                ((StrongReferenceCounter) this.f40393B.f40389b.f40385c.get()).a(this.f40393B.f40388a);
            }
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$11  reason: invalid class name */
    class AnonymousClass11 implements ObservableOnSubscribe<CollectionChange<RealmList<Object>>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RealmList f40395a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ RealmObservableFactory f40396b;

        /* renamed from: io.realm.rx.RealmObservableFactory$11$1  reason: invalid class name */
        class AnonymousClass1 implements OrderedRealmCollectionChangeListener<RealmList<Object>> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ObservableEmitter f40397a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass11 f40398b;

            /* renamed from: b */
            public void a(RealmList realmList, OrderedCollectionChangeSet orderedCollectionChangeSet) {
                if (!realmList.A()) {
                    this.f40397a.onComplete();
                } else if (!this.f40397a.isDisposed()) {
                    ObservableEmitter observableEmitter = this.f40397a;
                    if (this.f40398b.f40396b.f40383a) {
                        realmList = realmList.s();
                    }
                    observableEmitter.onNext(new CollectionChange(realmList, orderedCollectionChangeSet));
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$11$2  reason: invalid class name */
        class AnonymousClass2 implements Runnable {

            /* renamed from: A  reason: collision with root package name */
            public final /* synthetic */ OrderedRealmCollectionChangeListener f40399A;

            /* renamed from: B  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass11 f40400B;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ Realm f40401z;

            public void run() {
                if (!this.f40401z.isClosed()) {
                    this.f40400B.f40395a.B(this.f40399A);
                    this.f40401z.close();
                }
                ((StrongReferenceCounter) this.f40400B.f40396b.f40385c.get()).a(this.f40400B.f40395a);
            }
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$12  reason: invalid class name */
    class AnonymousClass12 implements FlowableOnSubscribe<RealmList<Object>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RealmList f40402a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ RealmObservableFactory f40403b;

        /* renamed from: io.realm.rx.RealmObservableFactory$12$1  reason: invalid class name */
        class AnonymousClass1 implements RealmChangeListener<RealmList<Object>> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ FlowableEmitter f40404a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass12 f40405b;

            /* renamed from: b */
            public void a(RealmList realmList) {
                if (!realmList.A()) {
                    this.f40404a.onComplete();
                } else if (!this.f40404a.isCancelled()) {
                    FlowableEmitter flowableEmitter = this.f40404a;
                    if (this.f40405b.f40403b.f40383a) {
                        realmList = realmList.s();
                    }
                    flowableEmitter.onNext(realmList);
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$12$2  reason: invalid class name */
        class AnonymousClass2 implements Runnable {

            /* renamed from: A  reason: collision with root package name */
            public final /* synthetic */ RealmChangeListener f40406A;

            /* renamed from: B  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass12 f40407B;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ DynamicRealm f40408z;

            public void run() {
                if (!this.f40408z.isClosed()) {
                    this.f40407B.f40402a.C(this.f40406A);
                    this.f40408z.close();
                }
                ((StrongReferenceCounter) this.f40407B.f40403b.f40385c.get()).a(this.f40407B.f40402a);
            }
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$13  reason: invalid class name */
    class AnonymousClass13 implements ObservableOnSubscribe<CollectionChange<RealmList<Object>>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RealmList f40409a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ RealmObservableFactory f40410b;

        /* renamed from: io.realm.rx.RealmObservableFactory$13$1  reason: invalid class name */
        class AnonymousClass1 implements OrderedRealmCollectionChangeListener<RealmList<Object>> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ObservableEmitter f40411a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass13 f40412b;

            /* renamed from: b */
            public void a(RealmList realmList, OrderedCollectionChangeSet orderedCollectionChangeSet) {
                if (!realmList.A()) {
                    this.f40411a.onComplete();
                } else if (!this.f40411a.isDisposed()) {
                    ObservableEmitter observableEmitter = this.f40411a;
                    if (this.f40412b.f40410b.f40383a) {
                        realmList = realmList.s();
                    }
                    observableEmitter.onNext(new CollectionChange(realmList, orderedCollectionChangeSet));
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$13$2  reason: invalid class name */
        class AnonymousClass2 implements Runnable {

            /* renamed from: A  reason: collision with root package name */
            public final /* synthetic */ OrderedRealmCollectionChangeListener f40413A;

            /* renamed from: B  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass13 f40414B;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ DynamicRealm f40415z;

            public void run() {
                if (!this.f40415z.isClosed()) {
                    this.f40414B.f40409a.B(this.f40413A);
                    this.f40415z.close();
                }
                ((StrongReferenceCounter) this.f40414B.f40410b.f40385c.get()).a(this.f40414B.f40409a);
            }
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$4  reason: invalid class name */
    class AnonymousClass4 implements FlowableOnSubscribe<Realm> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RealmObservableFactory f40452a;

        /* renamed from: io.realm.rx.RealmObservableFactory$4$1  reason: invalid class name */
        class AnonymousClass1 implements RealmChangeListener<Realm> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ FlowableEmitter f40453a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass4 f40454b;

            /* renamed from: b */
            public void a(Realm realm) {
                if (!this.f40453a.isCancelled()) {
                    FlowableEmitter flowableEmitter = this.f40453a;
                    if (this.f40454b.f40452a.f40383a) {
                        realm = realm.y();
                    }
                    flowableEmitter.onNext(realm);
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$4$2  reason: invalid class name */
        class AnonymousClass2 implements Runnable {

            /* renamed from: A  reason: collision with root package name */
            public final /* synthetic */ RealmChangeListener f40455A;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ Realm f40456z;

            public void run() {
                if (!this.f40456z.isClosed()) {
                    this.f40456z.q1(this.f40455A);
                    this.f40456z.close();
                }
            }
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$5  reason: invalid class name */
    class AnonymousClass5 implements FlowableOnSubscribe<DynamicRealm> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RealmObservableFactory f40457a;

        /* renamed from: io.realm.rx.RealmObservableFactory$5$1  reason: invalid class name */
        class AnonymousClass1 implements RealmChangeListener<DynamicRealm> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ FlowableEmitter f40458a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass5 f40459b;

            /* renamed from: b */
            public void a(DynamicRealm dynamicRealm) {
                if (!this.f40458a.isCancelled()) {
                    FlowableEmitter flowableEmitter = this.f40458a;
                    if (this.f40459b.f40457a.f40383a) {
                        dynamicRealm = dynamicRealm.y();
                    }
                    flowableEmitter.onNext(dynamicRealm);
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$5$2  reason: invalid class name */
        class AnonymousClass2 implements Runnable {

            /* renamed from: A  reason: collision with root package name */
            public final /* synthetic */ RealmChangeListener f40460A;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ DynamicRealm f40461z;

            public void run() {
                if (!this.f40461z.isClosed()) {
                    this.f40461z.g0(this.f40460A);
                    this.f40461z.close();
                }
            }
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$6  reason: invalid class name */
    class AnonymousClass6 implements FlowableOnSubscribe<RealmResults<Object>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RealmResults f40462a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ RealmObservableFactory f40463b;

        /* renamed from: io.realm.rx.RealmObservableFactory$6$1  reason: invalid class name */
        class AnonymousClass1 implements RealmChangeListener<RealmResults<Object>> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ FlowableEmitter f40464a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass6 f40465b;

            /* renamed from: b */
            public void a(RealmResults realmResults) {
                if (!this.f40464a.isCancelled()) {
                    FlowableEmitter flowableEmitter = this.f40464a;
                    if (this.f40465b.f40463b.f40383a) {
                        realmResults = realmResults.p();
                    }
                    flowableEmitter.onNext(realmResults);
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$6$2  reason: invalid class name */
        class AnonymousClass2 implements Runnable {

            /* renamed from: A  reason: collision with root package name */
            public final /* synthetic */ RealmChangeListener f40466A;

            /* renamed from: B  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass6 f40467B;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ Realm f40468z;

            public void run() {
                if (!this.f40468z.isClosed()) {
                    this.f40467B.f40462a.u(this.f40466A);
                    this.f40468z.close();
                }
                ((StrongReferenceCounter) this.f40467B.f40463b.f40384b.get()).a(this.f40467B.f40462a);
            }
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$7  reason: invalid class name */
    class AnonymousClass7 implements ObservableOnSubscribe<CollectionChange<RealmResults<Object>>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RealmResults f40469a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ RealmObservableFactory f40470b;

        /* renamed from: io.realm.rx.RealmObservableFactory$7$1  reason: invalid class name */
        class AnonymousClass1 implements OrderedRealmCollectionChangeListener<RealmResults<Object>> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ObservableEmitter f40471a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass7 f40472b;

            /* renamed from: b */
            public void a(RealmResults realmResults, OrderedCollectionChangeSet orderedCollectionChangeSet) {
                if (!this.f40471a.isDisposed()) {
                    this.f40471a.onNext(new CollectionChange(this.f40472b.f40470b.f40383a ? this.f40472b.f40469a.p() : this.f40472b.f40469a, orderedCollectionChangeSet));
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$7$2  reason: invalid class name */
        class AnonymousClass2 implements Runnable {

            /* renamed from: A  reason: collision with root package name */
            public final /* synthetic */ OrderedRealmCollectionChangeListener f40473A;

            /* renamed from: B  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass7 f40474B;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ Realm f40475z;

            public void run() {
                if (!this.f40475z.isClosed()) {
                    this.f40474B.f40469a.s(this.f40473A);
                    this.f40475z.close();
                }
                ((StrongReferenceCounter) this.f40474B.f40470b.f40384b.get()).a(this.f40474B.f40469a);
            }
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$8  reason: invalid class name */
    class AnonymousClass8 implements FlowableOnSubscribe<RealmResults<Object>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RealmResults f40476a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ RealmObservableFactory f40477b;

        /* renamed from: io.realm.rx.RealmObservableFactory$8$1  reason: invalid class name */
        class AnonymousClass1 implements RealmChangeListener<RealmResults<Object>> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ FlowableEmitter f40478a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass8 f40479b;

            /* renamed from: b */
            public void a(RealmResults realmResults) {
                if (!this.f40478a.isCancelled()) {
                    FlowableEmitter flowableEmitter = this.f40478a;
                    if (this.f40479b.f40477b.f40383a) {
                        realmResults = realmResults.p();
                    }
                    flowableEmitter.onNext(realmResults);
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$8$2  reason: invalid class name */
        class AnonymousClass2 implements Runnable {

            /* renamed from: A  reason: collision with root package name */
            public final /* synthetic */ RealmChangeListener f40480A;

            /* renamed from: B  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass8 f40481B;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ DynamicRealm f40482z;

            public void run() {
                if (!this.f40482z.isClosed()) {
                    this.f40481B.f40476a.u(this.f40480A);
                    this.f40482z.close();
                }
                ((StrongReferenceCounter) this.f40481B.f40477b.f40384b.get()).a(this.f40481B.f40476a);
            }
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$9  reason: invalid class name */
    class AnonymousClass9 implements ObservableOnSubscribe<CollectionChange<RealmResults<Object>>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RealmResults f40483a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ RealmObservableFactory f40484b;

        /* renamed from: io.realm.rx.RealmObservableFactory$9$1  reason: invalid class name */
        class AnonymousClass1 implements OrderedRealmCollectionChangeListener<RealmResults<Object>> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ObservableEmitter f40485a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass9 f40486b;

            /* renamed from: b */
            public void a(RealmResults realmResults, OrderedCollectionChangeSet orderedCollectionChangeSet) {
                if (!this.f40485a.isDisposed()) {
                    ObservableEmitter observableEmitter = this.f40485a;
                    if (this.f40486b.f40484b.f40383a) {
                        realmResults = realmResults.p();
                    }
                    observableEmitter.onNext(new CollectionChange(realmResults, orderedCollectionChangeSet));
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$9$2  reason: invalid class name */
        class AnonymousClass2 implements Runnable {

            /* renamed from: A  reason: collision with root package name */
            public final /* synthetic */ OrderedRealmCollectionChangeListener f40487A;

            /* renamed from: B  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass9 f40488B;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ DynamicRealm f40489z;

            public void run() {
                if (!this.f40489z.isClosed()) {
                    this.f40488B.f40483a.s(this.f40487A);
                    this.f40489z.close();
                }
                ((StrongReferenceCounter) this.f40488B.f40484b.f40384b.get()).a(this.f40488B.f40483a);
            }
        }
    }

    public static class StrongReferenceCounter<K> {

        /* renamed from: a  reason: collision with root package name */
        public final Map f40490a;

        public StrongReferenceCounter() {
            this.f40490a = new IdentityHashMap();
        }

        public void a(Object obj) {
            Integer num = (Integer) this.f40490a.get(obj);
            if (num == null) {
                throw new IllegalStateException("Object does not have any references: " + obj);
            } else if (num.intValue() > 1) {
                this.f40490a.put(obj, Integer.valueOf(num.intValue() - 1));
            } else if (num.intValue() == 1) {
                this.f40490a.remove(obj);
            } else {
                throw new IllegalStateException("Invalid reference count: " + num);
            }
        }
    }

    public RealmObservableFactory(boolean z2) {
        this.f40383a = z2;
    }

    public Observable a(DynamicRealm dynamicRealm, final DynamicRealmObject dynamicRealmObject) {
        if (dynamicRealm.N()) {
            return Observable.just(new ObjectChange(dynamicRealmObject, (ObjectChangeSet) null));
        }
        final RealmConfiguration E = dynamicRealm.E();
        Scheduler i2 = i();
        return Observable.create(new ObservableOnSubscribe<ObjectChange<DynamicRealmObject>>() {

            /* renamed from: io.realm.rx.RealmObservableFactory$17$1  reason: invalid class name */
            class AnonymousClass1 implements RealmObjectChangeListener<DynamicRealmObject> {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ ObservableEmitter f40445a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ AnonymousClass17 f40446b;

                /* renamed from: b */
                public void a(DynamicRealmObject dynamicRealmObject, ObjectChangeSet objectChangeSet) {
                    if (!this.f40445a.isDisposed()) {
                        ObservableEmitter observableEmitter = this.f40445a;
                        if (RealmObservableFactory.this.f40383a) {
                            dynamicRealmObject = (DynamicRealmObject) RealmObject.freeze(dynamicRealmObject);
                        }
                        observableEmitter.onNext(new ObjectChange(dynamicRealmObject, objectChangeSet));
                    }
                }
            }

            /* renamed from: io.realm.rx.RealmObservableFactory$17$2  reason: invalid class name */
            class AnonymousClass2 implements Runnable {

                /* renamed from: A  reason: collision with root package name */
                public final /* synthetic */ RealmObjectChangeListener f40447A;

                /* renamed from: B  reason: collision with root package name */
                public final /* synthetic */ AnonymousClass17 f40448B;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ DynamicRealm f40449z;

                public void run() {
                    if (!this.f40449z.isClosed()) {
                        RealmObject.removeChangeListener(dynamicRealmObject, this.f40447A);
                        this.f40449z.close();
                    }
                    ((StrongReferenceCounter) RealmObservableFactory.this.f40386d.get()).a(dynamicRealmObject);
                }
            }
        }).subscribeOn(i2).unsubscribeOn(i2);
    }

    public Flowable b(final Realm realm, final RealmModel realmModel) {
        if (realm.N()) {
            return Flowable.just(realmModel);
        }
        final RealmConfiguration E = realm.E();
        Scheduler i2 = i();
        return Flowable.create(new FlowableOnSubscribe<RealmModel>() {

            /* renamed from: io.realm.rx.RealmObservableFactory$14$1  reason: invalid class name */
            class AnonymousClass1 implements RealmChangeListener<RealmModel> {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ FlowableEmitter f40420a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ AnonymousClass14 f40421b;

                /* renamed from: b */
                public void a(RealmModel realmModel) {
                    if (!this.f40420a.isCancelled()) {
                        FlowableEmitter flowableEmitter = this.f40420a;
                        if (RealmObservableFactory.this.f40383a) {
                            realmModel = RealmObject.freeze(realmModel);
                        }
                        flowableEmitter.onNext(realmModel);
                    }
                }
            }

            /* renamed from: io.realm.rx.RealmObservableFactory$14$2  reason: invalid class name */
            class AnonymousClass2 implements Runnable {

                /* renamed from: A  reason: collision with root package name */
                public final /* synthetic */ RealmChangeListener f40422A;

                /* renamed from: B  reason: collision with root package name */
                public final /* synthetic */ AnonymousClass14 f40423B;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ Realm f40424z;

                public void run() {
                    if (!this.f40424z.isClosed()) {
                        RealmObject.removeChangeListener(realmModel, this.f40422A);
                        this.f40424z.close();
                    }
                    ((StrongReferenceCounter) RealmObservableFactory.this.f40386d.get()).a(realmModel);
                }
            }
        }, f40382e).subscribeOn(i2).unsubscribeOn(i2);
    }

    public Observable c(Realm realm, final RealmModel realmModel) {
        if (realm.N()) {
            return Observable.just(new ObjectChange(realmModel, (ObjectChangeSet) null));
        }
        final RealmConfiguration E = realm.E();
        Scheduler i2 = i();
        return Observable.create(new ObservableOnSubscribe<ObjectChange<RealmModel>>() {

            /* renamed from: io.realm.rx.RealmObservableFactory$15$1  reason: invalid class name */
            class AnonymousClass1 implements RealmObjectChangeListener<RealmModel> {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ ObservableEmitter f40428a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ AnonymousClass15 f40429b;

                public void a(RealmModel realmModel, ObjectChangeSet objectChangeSet) {
                    if (!this.f40428a.isDisposed()) {
                        ObservableEmitter observableEmitter = this.f40428a;
                        if (RealmObservableFactory.this.f40383a) {
                            realmModel = RealmObject.freeze(realmModel);
                        }
                        observableEmitter.onNext(new ObjectChange(realmModel, objectChangeSet));
                    }
                }
            }

            /* renamed from: io.realm.rx.RealmObservableFactory$15$2  reason: invalid class name */
            class AnonymousClass2 implements Runnable {

                /* renamed from: A  reason: collision with root package name */
                public final /* synthetic */ RealmObjectChangeListener f40430A;

                /* renamed from: B  reason: collision with root package name */
                public final /* synthetic */ AnonymousClass15 f40431B;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ Realm f40432z;

                public void run() {
                    if (!this.f40432z.isClosed()) {
                        RealmObject.removeChangeListener(realmModel, this.f40430A);
                        this.f40432z.close();
                    }
                    ((StrongReferenceCounter) RealmObservableFactory.this.f40386d.get()).a(realmModel);
                }
            }
        }).subscribeOn(i2).unsubscribeOn(i2);
    }

    public Flowable d(final DynamicRealm dynamicRealm, final DynamicRealmObject dynamicRealmObject) {
        if (dynamicRealm.N()) {
            return Flowable.just(dynamicRealmObject);
        }
        final RealmConfiguration E = dynamicRealm.E();
        Scheduler i2 = i();
        return Flowable.create(new FlowableOnSubscribe<DynamicRealmObject>() {

            /* renamed from: io.realm.rx.RealmObservableFactory$16$1  reason: invalid class name */
            class AnonymousClass1 implements RealmChangeListener<DynamicRealmObject> {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ FlowableEmitter f40437a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ AnonymousClass16 f40438b;

                /* renamed from: b */
                public void a(DynamicRealmObject dynamicRealmObject) {
                    if (!this.f40437a.isCancelled()) {
                        FlowableEmitter flowableEmitter = this.f40437a;
                        if (RealmObservableFactory.this.f40383a) {
                            dynamicRealmObject = (DynamicRealmObject) RealmObject.freeze(dynamicRealmObject);
                        }
                        flowableEmitter.onNext(dynamicRealmObject);
                    }
                }
            }

            /* renamed from: io.realm.rx.RealmObservableFactory$16$2  reason: invalid class name */
            class AnonymousClass2 implements Runnable {

                /* renamed from: A  reason: collision with root package name */
                public final /* synthetic */ RealmChangeListener f40439A;

                /* renamed from: B  reason: collision with root package name */
                public final /* synthetic */ AnonymousClass16 f40440B;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ DynamicRealm f40441z;

                public void run() {
                    if (!this.f40441z.isClosed()) {
                        RealmObject.removeChangeListener(dynamicRealmObject, this.f40439A);
                        this.f40441z.close();
                    }
                    ((StrongReferenceCounter) RealmObservableFactory.this.f40386d.get()).a(dynamicRealmObject);
                }
            }
        }, f40382e).subscribeOn(i2).unsubscribeOn(i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof RealmObservableFactory;
    }

    public int hashCode() {
        return 37;
    }

    public final Scheduler i() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return AndroidSchedulers.a(myLooper);
        }
        throw new IllegalStateException("No looper found");
    }
}
