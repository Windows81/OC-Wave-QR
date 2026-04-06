package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;

public final class AutoRolloutAssignmentEncoder implements Configurator {

    /* renamed from: a  reason: collision with root package name */
    public static final Configurator f31402a = new AutoRolloutAssignmentEncoder();

    public static final class RolloutAssignmentEncoder implements ObjectEncoder<RolloutAssignment> {

        /* renamed from: a  reason: collision with root package name */
        public static final RolloutAssignmentEncoder f31403a = new RolloutAssignmentEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f31404b = FieldDescriptor.d("rolloutId");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f31405c = FieldDescriptor.d("variantId");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f31406d = FieldDescriptor.d("parameterKey");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f31407e = FieldDescriptor.d("parameterValue");

        /* renamed from: f  reason: collision with root package name */
        public static final FieldDescriptor f31408f = FieldDescriptor.d("templateVersion");

        /* renamed from: b */
        public void a(RolloutAssignment rolloutAssignment, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f31404b, rolloutAssignment.d());
            objectEncoderContext.g(f31405c, rolloutAssignment.f());
            objectEncoderContext.g(f31406d, rolloutAssignment.b());
            objectEncoderContext.g(f31407e, rolloutAssignment.c());
            objectEncoderContext.b(f31408f, rolloutAssignment.e());
        }
    }

    public void a(EncoderConfig encoderConfig) {
        RolloutAssignmentEncoder rolloutAssignmentEncoder = RolloutAssignmentEncoder.f31403a;
        encoderConfig.a(RolloutAssignment.class, rolloutAssignmentEncoder);
        encoderConfig.a(AutoValue_RolloutAssignment.class, rolloutAssignmentEncoder);
    }
}
