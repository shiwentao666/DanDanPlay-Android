package cn.swt.dandanplay.play.component;

import cn.swt.dandanplay.play.module.MainModule;
import cn.swt.dandanplay.play.view.VideoViewActivity;
import dagger.Component;

/**
 * Title: MainComponent <br>
 * Description: <br>
 * Copyright (c) 传化物流版权所有 2016 <br>
 * Created DateTime: 2016/10/17 11:03
 * Created by Wentao.Shi.
 */
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(VideoViewActivity activity);
}
