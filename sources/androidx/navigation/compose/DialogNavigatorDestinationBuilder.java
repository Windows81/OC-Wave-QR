package androidx.navigation.compose;

import androidx.compose.ui.window.DialogProperties;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.Navigator;
import androidx.navigation.compose.DialogNavigator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KClass;

@Metadata
@NavDestinationDsl
public final class DialogNavigatorDestinationBuilder extends NavDestinationBuilder<DialogNavigator.Destination> {

    /* renamed from: i  reason: collision with root package name */
    public final DialogNavigator f22496i;

    /* renamed from: j  reason: collision with root package name */
    public final DialogProperties f22497j;

    /* renamed from: k  reason: collision with root package name */
    public final Function3 f22498k;

    public DialogNavigatorDestinationBuilder(DialogNavigator dialogNavigator, KClass kClass, Map map, DialogProperties dialogProperties, Function3 function3) {
        super((Navigator) dialogNavigator, kClass, map);
        this.f22496i = dialogNavigator;
        this.f22497j = dialogProperties;
        this.f22498k = function3;
    }

    /* renamed from: f */
    public DialogNavigator.Destination d() {
        return new DialogNavigator.Destination(this.f22496i, this.f22497j, this.f22498k);
    }
}
