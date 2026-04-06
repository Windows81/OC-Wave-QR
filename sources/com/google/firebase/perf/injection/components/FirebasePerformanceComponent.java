package com.google.firebase.perf.injection.components;

import com.google.firebase.perf.FirebasePerformance;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component
public interface FirebasePerformanceComponent {
    FirebasePerformance a();
}
