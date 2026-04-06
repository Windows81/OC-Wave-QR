package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.collection.MutableLongSet;
import androidx.compose.foundation.text.DeadKeyCombiner;
import androidx.compose.foundation.text.KeyEventHelpers_androidKt;
import androidx.compose.foundation.text.KeyMapping;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.foundation.text.TextFieldKeyInput_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public abstract class TextFieldKeyEventHandler {

    /* renamed from: a  reason: collision with root package name */
    public final TextFieldPreparedSelectionState f6346a = new TextFieldPreparedSelectionState();

    /* renamed from: b  reason: collision with root package name */
    public final DeadKeyCombiner f6347b = new DeadKeyCombiner();

    /* renamed from: c  reason: collision with root package name */
    public final KeyMapping f6348c = KeyMapping_androidKt.a();

    /* renamed from: d  reason: collision with root package name */
    public MutableLongSet f6349d;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6350a;

        /* JADX WARNING: Can't wrap try/catch for region: R(98:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|(2:95|96)|97|99) */
        /* JADX WARNING: Can't wrap try/catch for region: R(99:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|99) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0096 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00be */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00c8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00d2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00dc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00e6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00fa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0104 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x010e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0118 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0122 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0136 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0140 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x014a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0154 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x015e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0168 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0172 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x017c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0186 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0190 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x019a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x01a4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x01ae */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x01b8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x01c2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x01cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x01d6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.compose.foundation.text.KeyCommand[] r0 = androidx.compose.foundation.text.KeyCommand.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.COPY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.PASTE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.CUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.LEFT_CHAR     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.RIGHT_CHAR     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.LEFT_WORD     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.RIGHT_WORD     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.PREV_PARAGRAPH     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.NEXT_PARAGRAPH     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.UP     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.DOWN     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.PAGE_UP     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.PAGE_DOWN     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.LINE_START     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.LINE_END     // Catch:{ NoSuchFieldError -> 0x0096 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
            L_0x0096:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.LINE_LEFT     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.LINE_RIGHT     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.HOME     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.END     // Catch:{ NoSuchFieldError -> 0x00be }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00be }
            L_0x00be:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.DELETE_PREV_CHAR     // Catch:{ NoSuchFieldError -> 0x00c8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c8 }
            L_0x00c8:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.DELETE_NEXT_CHAR     // Catch:{ NoSuchFieldError -> 0x00d2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d2 }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d2 }
            L_0x00d2:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.DELETE_PREV_WORD     // Catch:{ NoSuchFieldError -> 0x00dc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dc }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dc }
            L_0x00dc:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.DELETE_NEXT_WORD     // Catch:{ NoSuchFieldError -> 0x00e6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e6 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e6 }
            L_0x00e6:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.DELETE_FROM_LINE_START     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.DELETE_TO_LINE_END     // Catch:{ NoSuchFieldError -> 0x00fa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fa }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fa }
            L_0x00fa:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.NEW_LINE     // Catch:{ NoSuchFieldError -> 0x0104 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0104 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0104 }
            L_0x0104:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.TAB     // Catch:{ NoSuchFieldError -> 0x010e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010e }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x010e }
            L_0x010e:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.SELECT_ALL     // Catch:{ NoSuchFieldError -> 0x0118 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0118 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0118 }
            L_0x0118:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.SELECT_LEFT_CHAR     // Catch:{ NoSuchFieldError -> 0x0122 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0122 }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0122 }
            L_0x0122:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.SELECT_RIGHT_CHAR     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.SELECT_LEFT_WORD     // Catch:{ NoSuchFieldError -> 0x0136 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0136 }
                r2 = 31
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0136 }
            L_0x0136:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.SELECT_RIGHT_WORD     // Catch:{ NoSuchFieldError -> 0x0140 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0140 }
                r2 = 32
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0140 }
            L_0x0140:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.SELECT_PREV_PARAGRAPH     // Catch:{ NoSuchFieldError -> 0x014a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x014a }
                r2 = 33
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x014a }
            L_0x014a:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.SELECT_NEXT_PARAGRAPH     // Catch:{ NoSuchFieldError -> 0x0154 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0154 }
                r2 = 34
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0154 }
            L_0x0154:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.SELECT_LINE_START     // Catch:{ NoSuchFieldError -> 0x015e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015e }
                r2 = 35
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015e }
            L_0x015e:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.SELECT_LINE_END     // Catch:{ NoSuchFieldError -> 0x0168 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0168 }
                r2 = 36
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0168 }
            L_0x0168:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.SELECT_LINE_LEFT     // Catch:{ NoSuchFieldError -> 0x0172 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0172 }
                r2 = 37
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0172 }
            L_0x0172:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.SELECT_LINE_RIGHT     // Catch:{ NoSuchFieldError -> 0x017c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x017c }
                r2 = 38
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x017c }
            L_0x017c:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.SELECT_UP     // Catch:{ NoSuchFieldError -> 0x0186 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0186 }
                r2 = 39
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0186 }
            L_0x0186:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.SELECT_DOWN     // Catch:{ NoSuchFieldError -> 0x0190 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0190 }
                r2 = 40
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0190 }
            L_0x0190:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.SELECT_PAGE_UP     // Catch:{ NoSuchFieldError -> 0x019a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x019a }
                r2 = 41
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x019a }
            L_0x019a:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.SELECT_PAGE_DOWN     // Catch:{ NoSuchFieldError -> 0x01a4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a4 }
                r2 = 42
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01a4 }
            L_0x01a4:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.SELECT_HOME     // Catch:{ NoSuchFieldError -> 0x01ae }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ae }
                r2 = 43
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01ae }
            L_0x01ae:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.SELECT_END     // Catch:{ NoSuchFieldError -> 0x01b8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b8 }
                r2 = 44
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01b8 }
            L_0x01b8:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.DESELECT     // Catch:{ NoSuchFieldError -> 0x01c2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c2 }
                r2 = 45
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01c2 }
            L_0x01c2:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.UNDO     // Catch:{ NoSuchFieldError -> 0x01cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01cc }
                r2 = 46
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01cc }
            L_0x01cc:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.REDO     // Catch:{ NoSuchFieldError -> 0x01d6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d6 }
                r2 = 47
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01d6 }
            L_0x01d6:
                androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.CHARACTER_PALETTE     // Catch:{ NoSuchFieldError -> 0x01e0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e0 }
                r2 = 48
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01e0 }
            L_0x01e0:
                f6350a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler.WhenMappings.<clinit>():void");
        }
    }

    public final float a(TextLayoutState textLayoutState) {
        LayoutCoordinates j2 = textLayoutState.j();
        if (j2 != null) {
            Rect rect = null;
            if (!j2.b()) {
                j2 = null;
            }
            if (j2 != null) {
                LayoutCoordinates e2 = textLayoutState.e();
                if (e2 != null) {
                    if (!e2.b()) {
                        e2 = null;
                    }
                    if (e2 != null) {
                        rect = LayoutCoordinates.J(e2, j2, false, 2, (Object) null);
                    }
                }
                if (rect != null) {
                    return Float.intBitsToFloat((int) (rect.q() & 4294967295L));
                }
            }
        }
        return Float.NaN;
    }

    public boolean b(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, Function1 function1, boolean z2, boolean z3, Function0 function0) {
        long a2 = KeyEvent_androidKt.a(keyEvent);
        int b2 = KeyEvent_androidKt.b(keyEvent);
        KeyEventType.Companion companion = KeyEventType.f16777b;
        if (KeyEventType.f(b2, companion.b())) {
            MutableLongSet mutableLongSet = this.f6349d;
            if (mutableLongSet == null || !mutableLongSet.a(a2)) {
                return false;
            }
            MutableLongSet mutableLongSet2 = this.f6349d;
            if (mutableLongSet2 != null) {
                mutableLongSet2.m(a2);
            }
            return true;
        } else if (KeyEventType.f(KeyEvent_androidKt.b(keyEvent), companion.c()) && !TextFieldKeyInput_androidKt.a(keyEvent)) {
            return false;
        } else {
            boolean d2 = d(keyEvent, transformedTextFieldState, textLayoutState, function1, z2, z3, function0);
            if (d2) {
                MutableLongSet mutableLongSet3 = this.f6349d;
                if (mutableLongSet3 == null) {
                    mutableLongSet3 = new MutableLongSet(3);
                    this.f6349d = mutableLongSet3;
                }
                mutableLongSet3.l(a2);
            }
            return d2;
        }
    }

    public boolean c(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController) {
        if (TextRange.h(transformedTextFieldState.o().g()) || !KeyEventHelpers_androidKt.a(keyEvent)) {
            return false;
        }
        textFieldSelectionState.L();
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01e0, code lost:
        if (androidx.compose.ui.text.TextRange.g(r2.s(), r2.i().g()) != false) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01e2, code lost:
        r15.B(r2.s());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ed, code lost:
        if (r2.t() == null) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ef, code lost:
        r1 = r2.t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01f3, code lost:
        if (r1 == null) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0201, code lost:
        if (androidx.compose.ui.text.TextRange.h(r15.n().g()) == false) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0203, code lost:
        r15.D(new androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x020c, code lost:
        r15.D(androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity.b(r2.j(), (androidx.compose.foundation.text.input.internal.WedgeAffinity) null, r1, 1, (java.lang.Object) null));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(android.view.KeyEvent r14, androidx.compose.foundation.text.input.internal.TransformedTextFieldState r15, androidx.compose.foundation.text.input.internal.TextLayoutState r16, kotlin.jvm.functions.Function1 r17, boolean r18, boolean r19, kotlin.jvm.functions.Function0 r20) {
        /*
            r13 = this;
            r0 = r13
            r1 = r14
            r8 = r15
            boolean r2 = androidx.compose.foundation.text.TextFieldKeyInput_androidKt.a(r14)
            r9 = 0
            r10 = 1
            if (r2 == 0) goto L_0x0046
            androidx.compose.foundation.text.DeadKeyCombiner r2 = r0.f6347b
            java.lang.Integer r2 = r2.a(r14)
            if (r2 == 0) goto L_0x0046
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 2
            r3.<init>(r4)
            int r2 = r2.intValue()
            java.lang.StringBuilder r2 = androidx.compose.foundation.text.StringHelpers_jvmKt.a(r3, r2)
            java.lang.String r2 = r2.toString()
            if (r18 == 0) goto L_0x0045
            boolean r1 = androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler_androidKt.c(r14)
            r1 = r1 ^ r10
            r3 = 4
            r4 = 0
            r5 = 1
            r6 = 0
            r14 = r15
            r15 = r2
            r16 = r5
            r17 = r6
            r18 = r1
            r19 = r3
            r20 = r4
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState.x(r14, r15, r16, r17, r18, r19, r20)
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelectionState r1 = r0.f6346a
            r1.b()
            r9 = r10
        L_0x0045:
            return r9
        L_0x0046:
            androidx.compose.foundation.text.KeyMapping r2 = r0.f6348c
            androidx.compose.foundation.text.KeyCommand r11 = r2.a(r14)
            if (r11 == 0) goto L_0x0218
            boolean r2 = r11.f()
            if (r2 == 0) goto L_0x0058
            if (r18 != 0) goto L_0x0058
            goto L_0x0218
        L_0x0058:
            boolean r5 = androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler_androidKt.c(r14)
            androidx.compose.ui.text.TextLayoutResult r4 = r16.f()
            r2 = r16
            float r6 = r13.a(r2)
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection r12 = new androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelectionState r7 = r0.f6346a
            r2 = r12
            r3 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            int[] r2 = androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler.WhenMappings.f6350a
            int r3 = r11.ordinal()
            r2 = r2[r3]
            switch(r2) {
                case 1: goto L_0x01ca;
                case 2: goto L_0x01ca;
                case 3: goto L_0x01ca;
                case 4: goto L_0x01c4;
                case 5: goto L_0x01be;
                case 6: goto L_0x01ba;
                case 7: goto L_0x01b6;
                case 8: goto L_0x01b2;
                case 9: goto L_0x01ae;
                case 10: goto L_0x01aa;
                case 11: goto L_0x01a6;
                case 12: goto L_0x01a2;
                case 13: goto L_0x019e;
                case 14: goto L_0x019a;
                case 15: goto L_0x0196;
                case 16: goto L_0x0192;
                case 17: goto L_0x018e;
                case 18: goto L_0x018a;
                case 19: goto L_0x0186;
                case 20: goto L_0x017e;
                case 21: goto L_0x0176;
                case 22: goto L_0x016d;
                case 23: goto L_0x0164;
                case 24: goto L_0x015b;
                case 25: goto L_0x0152;
                case 26: goto L_0x0139;
                case 27: goto L_0x0125;
                case 28: goto L_0x0120;
                case 29: goto L_0x0117;
                case 30: goto L_0x010e;
                case 31: goto L_0x0105;
                case 32: goto L_0x00fc;
                case 33: goto L_0x00f3;
                case 34: goto L_0x00ea;
                case 35: goto L_0x00e1;
                case 36: goto L_0x00d8;
                case 37: goto L_0x00cf;
                case 38: goto L_0x00c6;
                case 39: goto L_0x00bd;
                case 40: goto L_0x00b4;
                case 41: goto L_0x00ab;
                case 42: goto L_0x00a2;
                case 43: goto L_0x0099;
                case 44: goto L_0x0090;
                case 45: goto L_0x008b;
                case 46: goto L_0x0086;
                case 47: goto L_0x0081;
                case 48: goto L_0x007c;
                default: goto L_0x007a;
            }
        L_0x007a:
            goto L_0x01cf
        L_0x007c:
            androidx.compose.foundation.text.KeyEventHelpers_androidKt.b()
            goto L_0x01cf
        L_0x0081:
            r15.u()
            goto L_0x01cf
        L_0x0086:
            r15.E()
            goto L_0x01cf
        L_0x008b:
            r12.h()
            goto L_0x01cf
        L_0x0090:
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection r1 = r12.J()
            r1.S()
            goto L_0x01cf
        L_0x0099:
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection r1 = r12.K()
            r1.S()
            goto L_0x01cf
        L_0x00a2:
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection r1 = r12.y()
            r1.S()
            goto L_0x01cf
        L_0x00ab:
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection r1 = r12.Q()
            r1.S()
            goto L_0x01cf
        L_0x00b4:
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection r1 = r12.x()
            r1.S()
            goto L_0x01cf
        L_0x00bd:
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection r1 = r12.P()
            r1.S()
            goto L_0x01cf
        L_0x00c6:
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection r1 = r12.N()
            r1.S()
            goto L_0x01cf
        L_0x00cf:
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection r1 = r12.M()
            r1.S()
            goto L_0x01cf
        L_0x00d8:
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection r1 = r12.L()
            r1.S()
            goto L_0x01cf
        L_0x00e1:
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection r1 = r12.O()
            r1.S()
            goto L_0x01cf
        L_0x00ea:
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection r1 = r12.C()
            r1.S()
            goto L_0x01cf
        L_0x00f3:
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection r1 = r12.F()
            r1.S()
            goto L_0x01cf
        L_0x00fc:
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection r1 = r12.I()
            r1.S()
            goto L_0x01cf
        L_0x0105:
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection r1 = r12.A()
            r1.S()
            goto L_0x01cf
        L_0x010e:
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection r1 = r12.H()
            r1.S()
            goto L_0x01cf
        L_0x0117:
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection r1 = r12.z()
            r1.S()
            goto L_0x01cf
        L_0x0120:
            r12.R()
            goto L_0x01cf
        L_0x0125:
            if (r19 != 0) goto L_0x01d0
            boolean r1 = androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler_androidKt.c(r14)
            r5 = r1 ^ 1
            r6 = 4
            r7 = 0
            java.lang.String r2 = "\t"
            r3 = 1
            r4 = 0
            r1 = r15
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState.x(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x01cf
        L_0x0139:
            if (r19 != 0) goto L_0x014d
            boolean r1 = androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler_androidKt.c(r14)
            r5 = r1 ^ 1
            r6 = 4
            r7 = 0
            java.lang.String r2 = "\n"
            r3 = 1
            r4 = 0
            r1 = r15
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState.x(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x01cf
        L_0x014d:
            r20.invoke()
            goto L_0x01cf
        L_0x0152:
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection r1 = r12.L()
            r1.g()
            goto L_0x01cf
        L_0x015b:
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection r1 = r12.O()
            r1.g()
            goto L_0x01cf
        L_0x0164:
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection r1 = r12.D()
            r1.g()
            goto L_0x01cf
        L_0x016d:
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection r1 = r12.G()
            r1.g()
            goto L_0x01cf
        L_0x0176:
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection r1 = r12.B()
            r1.g()
            goto L_0x01cf
        L_0x017e:
            androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection r1 = r12.E()
            r1.g()
            goto L_0x01cf
        L_0x0186:
            r12.J()
            goto L_0x01cf
        L_0x018a:
            r12.K()
            goto L_0x01cf
        L_0x018e:
            r12.N()
            goto L_0x01cf
        L_0x0192:
            r12.M()
            goto L_0x01cf
        L_0x0196:
            r12.L()
            goto L_0x01cf
        L_0x019a:
            r12.O()
            goto L_0x01cf
        L_0x019e:
            r12.y()
            goto L_0x01cf
        L_0x01a2:
            r12.Q()
            goto L_0x01cf
        L_0x01a6:
            r12.x()
            goto L_0x01cf
        L_0x01aa:
            r12.P()
            goto L_0x01cf
        L_0x01ae:
            r12.C()
            goto L_0x01cf
        L_0x01b2:
            r12.F()
            goto L_0x01cf
        L_0x01b6:
            r12.I()
            goto L_0x01cf
        L_0x01ba:
            r12.A()
            goto L_0x01cf
        L_0x01be:
            androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler$processKeyDownEvent$1$2 r1 = androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler$processKeyDownEvent$1$2.f6352z
            r12.f(r1)
            goto L_0x01cf
        L_0x01c4:
            androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler$processKeyDownEvent$1$1 r1 = androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler$processKeyDownEvent$1$1.f6351z
            r12.e(r1)
            goto L_0x01cf
        L_0x01ca:
            r1 = r17
            r1.invoke(r11)
        L_0x01cf:
            r9 = r10
        L_0x01d0:
            long r1 = r12.s()
            androidx.compose.foundation.text.input.TextFieldCharSequence r3 = r12.i()
            long r3 = r3.g()
            boolean r1 = androidx.compose.ui.text.TextRange.g(r1, r3)
            if (r1 != 0) goto L_0x01e9
            long r1 = r12.s()
            r15.B(r1)
        L_0x01e9:
            androidx.compose.foundation.text.input.internal.WedgeAffinity r1 = r12.t()
            if (r1 == 0) goto L_0x0218
            androidx.compose.foundation.text.input.internal.WedgeAffinity r1 = r12.t()
            if (r1 == 0) goto L_0x0218
            androidx.compose.foundation.text.input.TextFieldCharSequence r2 = r15.n()
            long r2 = r2.g()
            boolean r2 = androidx.compose.ui.text.TextRange.h(r2)
            if (r2 == 0) goto L_0x020c
            androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity r2 = new androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity
            r2.<init>(r1)
            r15.D(r2)
            goto L_0x0218
        L_0x020c:
            androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity r2 = r12.j()
            r3 = 0
            androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity r1 = androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity.b(r2, r3, r1, r10, r3)
            r15.D(r1)
        L_0x0218:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler.d(android.view.KeyEvent, androidx.compose.foundation.text.input.internal.TransformedTextFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState, kotlin.jvm.functions.Function1, boolean, boolean, kotlin.jvm.functions.Function0):boolean");
    }
}
