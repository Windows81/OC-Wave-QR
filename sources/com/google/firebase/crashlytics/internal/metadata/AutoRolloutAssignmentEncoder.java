package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;

public final class AutoRolloutAssignmentEncoder implements Configurator {

    /* renamed from: a  reason: collision with root package name */
    public static final Configurator f30116a = new AutoRolloutAssignmentEncoder();

    public static final class RolloutAssignmentEncoder implements ObjectEncoder<RolloutAssignment> {

        /* renamed from: a  reason: collision with root package name */
        public static final RolloutAssignmentEncoder f30117a = new RolloutAssignmentEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30118b = FieldDescriptor.d("rolloutId");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f30119c = FieldDescriptor.d("parameterKey");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f30120d = FieldDescriptor.d("parameterValue");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f30121e = FieldDescriptor.d("variantId");

        /* renamed from: f  reason: collision with root package name */
        public static final FieldDescriptor f30122f = FieldDescriptor.d("templateVersion");

        /* renamed from: b */
        public void a(RolloutAssignment rolloutAssignment, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f30118b, rolloutAssignment.e());
            objectEncoderContext.g(f30119c, rolloutAssignment.c());
            objectEncoderContext.g(f30120d, rolloutAssignment.d());
            objectEncoderContext.g(f30121e, rolloutAssignment.g());
            objectEncoderContext.b(f30122f, rolloutAssignment.f());
        }
    }

    public void a(EncoderConfig encoderConfig) {
        RolloutAssignmentEncoder rolloutAssignmentEncoder = RolloutAssignmentEncoder.f30117a;
        encoderConfig.a(RolloutAssignment.class, rolloutAssignmentEncoder);
        encoderConfig.a(AutoValue_RolloutAssignment.class, rolloutAssignmentEncoder);
    }
}
