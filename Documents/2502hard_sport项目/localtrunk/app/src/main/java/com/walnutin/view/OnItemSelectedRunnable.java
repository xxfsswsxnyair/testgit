// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walnutin.view;

// Referenced classes of package com.qingchifan.view:
//            LoopView, OnItemSelectedListener

import com.walnutin.view.LoopView;

public  final class OnItemSelectedRunnable implements Runnable {
    final LoopView loopView;

    public OnItemSelectedRunnable(LoopView loopview) {
        loopView = loopview;
    }

    @Override
    public final void run() {
        loopView.onItemSelectedListener.onItemSelected(loopView.getSelectedItem());
    }
}
