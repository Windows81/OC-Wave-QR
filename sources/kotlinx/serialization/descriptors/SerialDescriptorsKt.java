package kotlinx.serialization.descriptors;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.internal.PrimitivesKt;

@Metadata
public final class SerialDescriptorsKt {
    public static final SerialDescriptor c(String str, PrimitiveKind primitiveKind) {
        Intrinsics.i(str, "serialName");
        Intrinsics.i(primitiveKind, "kind");
        if (!StringsKt.l0(str)) {
            return PrimitivesKt.a(str, primitiveKind);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    public static final SerialDescriptor d(String str, SerialDescriptor[] serialDescriptorArr, Function1 function1) {
        Intrinsics.i(str, "serialName");
        Intrinsics.i(serialDescriptorArr, "typeParameters");
        Intrinsics.i(function1, "builderAction");
        if (!StringsKt.l0(str)) {
            ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new ClassSerialDescriptorBuilder(str);
            function1.invoke(classSerialDescriptorBuilder);
            return new SerialDescriptorImpl(str, StructureKind.CLASS.f42058a, classSerialDescriptorBuilder.f().size(), ArraysKt.a1(serialDescriptorArr), classSerialDescriptorBuilder);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    public static /* synthetic */ SerialDescriptor e(String str, SerialDescriptor[] serialDescriptorArr, Function1 function1, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            new c
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: CONSTRUCTOR  (r2v2 ? I:kotlinx.serialization.descriptors.c) =  call: kotlinx.serialization.descriptors.c.<init>():void type: CONSTRUCTOR in method: kotlinx.serialization.descriptors.SerialDescriptorsKt.e(java.lang.String, kotlinx.serialization.descriptors.SerialDescriptor[], kotlin.jvm.functions.Function1, int, java.lang.Object):kotlinx.serialization.descriptors.SerialDescriptor, dex: classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v2 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                r3 = r3 & 4
                if (r3 == 0) goto L_0x0009
                kotlinx.serialization.descriptors.c r2 = new kotlinx.serialization.descriptors.c
                r2.<init>()
            L_0x0009:
                kotlinx.serialization.descriptors.SerialDescriptor r0 = d(r0, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.descriptors.SerialDescriptorsKt.e(java.lang.String, kotlinx.serialization.descriptors.SerialDescriptor[], kotlin.jvm.functions.Function1, int, java.lang.Object):kotlinx.serialization.descriptors.SerialDescriptor");
        }

        public static final Unit f(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
            Intrinsics.i(classSerialDescriptorBuilder, "<this>");
            return Unit.f40552a;
        }

        public static final SerialDescriptor g(String str, SerialKind serialKind, SerialDescriptor[] serialDescriptorArr, Function1 function1) {
            Intrinsics.i(str, "serialName");
            Intrinsics.i(serialKind, "kind");
            Intrinsics.i(serialDescriptorArr, "typeParameters");
            Intrinsics.i(function1, "builder");
            if (StringsKt.l0(str)) {
                throw new IllegalArgumentException("Blank serial names are prohibited");
            } else if (!Intrinsics.d(serialKind, StructureKind.CLASS.f42058a)) {
                ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new ClassSerialDescriptorBuilder(str);
                function1.invoke(classSerialDescriptorBuilder);
                return new SerialDescriptorImpl(str, serialKind, classSerialDescriptorBuilder.f().size(), ArraysKt.a1(serialDescriptorArr), classSerialDescriptorBuilder);
            } else {
                throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            }
        }

        public static /* synthetic */ SerialDescriptor h(String str, SerialKind serialKind, SerialDescriptor[] serialDescriptorArr, Function1 function1, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                new d
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: CONSTRUCTOR  (r3v2 ? I:kotlinx.serialization.descriptors.d) =  call: kotlinx.serialization.descriptors.d.<init>():void type: CONSTRUCTOR in method: kotlinx.serialization.descriptors.SerialDescriptorsKt.h(java.lang.String, kotlinx.serialization.descriptors.SerialKind, kotlinx.serialization.descriptors.SerialDescriptor[], kotlin.jvm.functions.Function1, int, java.lang.Object):kotlinx.serialization.descriptors.SerialDescriptor, dex: classes4.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v2 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 34 more
                    */
                /*
                    r4 = r4 & 8
                    if (r4 == 0) goto L_0x0009
                    kotlinx.serialization.descriptors.d r3 = new kotlinx.serialization.descriptors.d
                    r3.<init>()
                L_0x0009:
                    kotlinx.serialization.descriptors.SerialDescriptor r0 = g(r0, r1, r2, r3)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.descriptors.SerialDescriptorsKt.h(java.lang.String, kotlinx.serialization.descriptors.SerialKind, kotlinx.serialization.descriptors.SerialDescriptor[], kotlin.jvm.functions.Function1, int, java.lang.Object):kotlinx.serialization.descriptors.SerialDescriptor");
            }

            public static final Unit i(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
                Intrinsics.i(classSerialDescriptorBuilder, "<this>");
                return Unit.f40552a;
            }
        }
