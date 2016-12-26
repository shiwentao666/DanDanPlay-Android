package cn.swt.dandanplay.fileexplorer.module;

import cn.swt.dandanplay.fileexplorer.contract.FileExplorerContract;
import cn.swt.dandanplay.fileexplorer.contract.MainContract;
import dagger.Module;
import dagger.Provides;

/**
 * Title: MainModule <br>
 * Description: <br>
 * Copyright (c) 传化物流版权所有 2016 <br>
 * Created DateTime: 2016/10/17 11:01
 * Created by Wentao.Shi.
 */
@Module
public class MainModule {
    private MainContract.View mView;
    private FileExplorerContract.View mFileView;
    public MainModule(MainContract.View view) {
        mView = view;
    }
    public MainModule(FileExplorerContract.View view) {
        mFileView = view;
    }
    @Provides
    MainContract.View provideMainView() {
        return mView;
    }
    @Provides
    FileExplorerContract.View provideFileView() {
        return mFileView;
    }
}