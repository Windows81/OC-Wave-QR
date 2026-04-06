package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CheckReturnValue
final class ExtensionSchemaLite extends ExtensionSchema<GeneratedMessageLite.ExtensionDescriptor> {

    /* renamed from: com.google.protobuf.ExtensionSchemaLite$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32114a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32114a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32114a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32114a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32114a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32114a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32114a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32114a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f32114a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f32114a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f32114a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f32114a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f32114a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f32114a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f32114a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f32114a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f32114a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f32114a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f32114a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ExtensionSchemaLite.AnonymousClass1.<clinit>():void");
        }
    }

    public int a(Map.Entry entry) {
        return ((GeneratedMessageLite.ExtensionDescriptor) entry.getKey()).i();
    }

    public Object b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i2) {
        return extensionRegistryLite.a(messageLite, i2);
    }

    public FieldSet c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    public FieldSet d(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).e0();
    }

    public boolean e(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    public void f(Object obj) {
        c(obj).u();
    }

    public Object g(Object obj, Reader reader, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet, Object obj3, UnknownFieldSchema unknownFieldSchema) {
        Object obj4;
        Object i2;
        ArrayList arrayList;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj2;
        int c2 = generatedExtension.c();
        if (!generatedExtension.f32159d.q() || !generatedExtension.f32159d.v()) {
            if (generatedExtension.a() != WireFormat.FieldType.ENUM) {
                switch (AnonymousClass1.f32114a[generatedExtension.a().ordinal()]) {
                    case 1:
                        obj4 = Double.valueOf(reader.readDouble());
                        break;
                    case 2:
                        obj4 = Float.valueOf(reader.readFloat());
                        break;
                    case 3:
                        obj4 = Long.valueOf(reader.n());
                        break;
                    case 4:
                        obj4 = Long.valueOf(reader.p());
                        break;
                    case 5:
                        obj4 = Integer.valueOf(reader.i());
                        break;
                    case 6:
                        obj4 = Long.valueOf(reader.q());
                        break;
                    case 7:
                        obj4 = Integer.valueOf(reader.u());
                        break;
                    case 8:
                        obj4 = Boolean.valueOf(reader.v());
                        break;
                    case 9:
                        obj4 = Integer.valueOf(reader.y());
                        break;
                    case 10:
                        obj4 = Integer.valueOf(reader.P());
                        break;
                    case 11:
                        obj4 = Long.valueOf(reader.w());
                        break;
                    case 12:
                        obj4 = Integer.valueOf(reader.G());
                        break;
                    case 13:
                        obj4 = Long.valueOf(reader.H());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        obj4 = reader.M();
                        break;
                    case 16:
                        obj4 = reader.h();
                        break;
                    case 17:
                        if (!generatedExtension.d()) {
                            Object i3 = fieldSet.i(generatedExtension.f32159d);
                            if (i3 instanceof GeneratedMessageLite) {
                                Schema d2 = Protobuf.a().d(i3);
                                if (!((GeneratedMessageLite) i3).Q()) {
                                    Object g2 = d2.g();
                                    d2.a(g2, i3);
                                    fieldSet.y(generatedExtension.f32159d, g2);
                                    i3 = g2;
                                }
                                reader.c(i3, d2, extensionRegistryLite);
                                return obj3;
                            }
                        }
                        obj4 = reader.e(generatedExtension.b().getClass(), extensionRegistryLite);
                        break;
                    case 18:
                        if (!generatedExtension.d()) {
                            Object i4 = fieldSet.i(generatedExtension.f32159d);
                            if (i4 instanceof GeneratedMessageLite) {
                                Schema d3 = Protobuf.a().d(i4);
                                if (!((GeneratedMessageLite) i4).Q()) {
                                    Object g3 = d3.g();
                                    d3.a(g3, i4);
                                    fieldSet.y(generatedExtension.f32159d, g3);
                                    i4 = g3;
                                }
                                reader.f(i4, d3, extensionRegistryLite);
                                return obj3;
                            }
                        }
                        obj4 = reader.b(generatedExtension.b().getClass(), extensionRegistryLite);
                        break;
                    default:
                        obj4 = null;
                        break;
                }
            } else {
                int i5 = reader.i();
                if (generatedExtension.f32159d.f().a(i5) == null) {
                    return SchemaUtil.L(obj, c2, i5, obj3, unknownFieldSchema);
                }
                obj4 = Integer.valueOf(i5);
            }
            if (generatedExtension.d()) {
                fieldSet.a(generatedExtension.f32159d, obj4);
            } else {
                int i6 = AnonymousClass1.f32114a[generatedExtension.a().ordinal()];
                if ((i6 == 17 || i6 == 18) && (i2 = fieldSet.i(generatedExtension.f32159d)) != null) {
                    obj4 = Internal.h(i2, obj4);
                }
                fieldSet.y(generatedExtension.f32159d, obj4);
            }
        } else {
            switch (AnonymousClass1.f32114a[generatedExtension.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    reader.R(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    reader.N(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    reader.z(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    reader.x(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    reader.B(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    reader.T(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    reader.F(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    reader.I(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    reader.t(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    reader.r(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    reader.A(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    reader.o(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    reader.s(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    reader.C(arrayList);
                    obj3 = SchemaUtil.z(obj, c2, arrayList, generatedExtension.f32159d.f(), obj3, unknownFieldSchema);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.f32159d.s());
            }
            fieldSet.y(generatedExtension.f32159d, arrayList);
        }
        return obj3;
    }

    public void h(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        fieldSet.y(generatedExtension.f32159d, reader.b(generatedExtension.b().getClass(), extensionRegistryLite));
    }

    public void i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        MessageLite.Builder h2 = generatedExtension.b().h();
        CodedInputStream F = byteString.F();
        h2.W0(F, extensionRegistryLite);
        fieldSet.y(generatedExtension.f32159d, h2.C());
        F.a(0);
    }

    public void j(Writer writer, Map.Entry entry) {
        GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = (GeneratedMessageLite.ExtensionDescriptor) entry.getKey();
        if (extensionDescriptor.q()) {
            switch (AnonymousClass1.f32114a[extensionDescriptor.s().ordinal()]) {
                case 1:
                    SchemaUtil.P(extensionDescriptor.i(), (List) entry.getValue(), writer, extensionDescriptor.v());
                    return;
                case 2:
                    SchemaUtil.T(extensionDescriptor.i(), (List) entry.getValue(), writer, extensionDescriptor.v());
                    return;
                case 3:
                    SchemaUtil.W(extensionDescriptor.i(), (List) entry.getValue(), writer, extensionDescriptor.v());
                    return;
                case 4:
                    SchemaUtil.e0(extensionDescriptor.i(), (List) entry.getValue(), writer, extensionDescriptor.v());
                    return;
                case 5:
                    SchemaUtil.V(extensionDescriptor.i(), (List) entry.getValue(), writer, extensionDescriptor.v());
                    return;
                case 6:
                    SchemaUtil.S(extensionDescriptor.i(), (List) entry.getValue(), writer, extensionDescriptor.v());
                    return;
                case 7:
                    SchemaUtil.R(extensionDescriptor.i(), (List) entry.getValue(), writer, extensionDescriptor.v());
                    return;
                case 8:
                    SchemaUtil.N(extensionDescriptor.i(), (List) entry.getValue(), writer, extensionDescriptor.v());
                    return;
                case 9:
                    SchemaUtil.d0(extensionDescriptor.i(), (List) entry.getValue(), writer, extensionDescriptor.v());
                    return;
                case 10:
                    SchemaUtil.Y(extensionDescriptor.i(), (List) entry.getValue(), writer, extensionDescriptor.v());
                    return;
                case 11:
                    SchemaUtil.Z(extensionDescriptor.i(), (List) entry.getValue(), writer, extensionDescriptor.v());
                    return;
                case 12:
                    SchemaUtil.a0(extensionDescriptor.i(), (List) entry.getValue(), writer, extensionDescriptor.v());
                    return;
                case 13:
                    SchemaUtil.b0(extensionDescriptor.i(), (List) entry.getValue(), writer, extensionDescriptor.v());
                    return;
                case 14:
                    SchemaUtil.V(extensionDescriptor.i(), (List) entry.getValue(), writer, extensionDescriptor.v());
                    return;
                case 15:
                    SchemaUtil.O(extensionDescriptor.i(), (List) entry.getValue(), writer);
                    return;
                case 16:
                    SchemaUtil.c0(extensionDescriptor.i(), (List) entry.getValue(), writer);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        SchemaUtil.U(extensionDescriptor.i(), (List) entry.getValue(), writer, Protobuf.a().c(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        SchemaUtil.X(extensionDescriptor.i(), (List) entry.getValue(), writer, Protobuf.a().c(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            switch (AnonymousClass1.f32114a[extensionDescriptor.s().ordinal()]) {
                case 1:
                    writer.t(extensionDescriptor.i(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    writer.P(extensionDescriptor.i(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    writer.D(extensionDescriptor.i(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    writer.A(extensionDescriptor.i(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                    writer.o(extensionDescriptor.i(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    writer.w(extensionDescriptor.i(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    writer.s(extensionDescriptor.i(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    writer.E(extensionDescriptor.i(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    writer.q(extensionDescriptor.i(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    writer.F(extensionDescriptor.i(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    writer.J(extensionDescriptor.i(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    writer.W(extensionDescriptor.i(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    writer.O(extensionDescriptor.i(), ((Long) entry.getValue()).longValue());
                    return;
                case 14:
                    writer.o(extensionDescriptor.i(), ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    writer.e(extensionDescriptor.i(), (ByteString) entry.getValue());
                    return;
                case 16:
                    writer.z(extensionDescriptor.i(), (String) entry.getValue());
                    return;
                case 17:
                    writer.d(extensionDescriptor.i(), entry.getValue(), Protobuf.a().c(entry.getValue().getClass()));
                    return;
                case 18:
                    writer.c(extensionDescriptor.i(), entry.getValue(), Protobuf.a().c(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
    }
}
