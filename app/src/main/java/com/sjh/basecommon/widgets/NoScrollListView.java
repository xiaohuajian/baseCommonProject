package com.sjh.basecommon.widgets;

import android.widget.ListView;

public class NoScrollListView extends ListView {

    public NoScrollListView(android.content.Context context, android.util.AttributeSet attrs){
        super(context, attrs);
    }

    /**
     * 设置不滚动
     */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);

    }
}
