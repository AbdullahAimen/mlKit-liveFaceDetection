/*
 * Copyright 2020 Google LLC. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mlkit.facedetection.utillities;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import com.mlkit.facedetection.facedetector.FaceGraphic;

/**
 * Graphic instance for rendering inference info (latency, FPS, resolution) in an overlay view.
 */
public class RectangleInfoGraphic extends GraphicOverlay.Graphic {

    private Paint rectPaint;

    public RectangleInfoGraphic(GraphicOverlay overlay) {
        super(overlay);
    }

    @Override
    public synchronized void draw(Canvas canvas) {

        // Draw FPS (if valid) and inference latency
        rectPaint = new Paint();
        rectPaint.setColor(Color.YELLOW);
        rectPaint.setStyle(Paint.Style.STROKE);
        rectPaint.setStrokeWidth(6f);
        canvas.drawRect(FaceGraphic.Companion.getBigRect(canvas), rectPaint);
    }


}
