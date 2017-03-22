package com.latihan.application.mapplace;

import java.util.List;

/**
 * Created by alodev3 on 24/12/16.
 */
public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}
