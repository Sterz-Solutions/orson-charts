/* ===========
 * OrsonCharts
 * ===========
 * 
 * (C)opyright 2013 by Object Refinery Limited.
 * 
 */

package com.orsoncharts.axis;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import com.orsoncharts.plot.CategoryPlot3D;
import com.orsoncharts.plot.XYZPlot;
import java.util.List;

/**
 * An axis that displays a range of continuous values.  These can be used
 * for the value axis in a {@link CategoryPlot3D}, and for the X, Y or Z
 * axes in an {@link XYZPlot}.
 */
public interface ValueAxis3D extends Axis3D {
    
    /**
     * Returns a flag indicating whether or not the axis should be drawn.  
     * 
     * @return A boolean. 
     */
    boolean isVisible();
    
    /**
     * Sets the flag that controls whether or not the axis is drawn on the 
     * chart and sends an {@link Axis3DChangeEvent} to all registered listeners.
     * 
     * @param visible  the new flag value.
     */
    void setVisible(boolean visible);
    
    /**
     * Configure the axis as a value axis for the specified plot.
     * 
     * @param plot  the plot (<code>null</code> not permitted). 
     */
    void configureAsValueAxis(CategoryPlot3D plot);
    
    /**
     * Configure the axis as an x-axis for the specified plot.
     * 
     * @param plot  the plot (<code>null</code> not permitted). 
     */
    void configureAsXAxis(XYZPlot plot);

    /**
     * Configure the axis as an y-axis for the specified plot.
     * 
     * @param plot  the plot (<code>null</code> not permitted). 
     */
    void configureAsYAxis(XYZPlot plot);
    
    /**
     * Configure the axis as an z-axis for the specified plot.
     * 
     * @param plot  the plot (<code>null</code> not permitted). 
     */
    void configureAsZAxis(XYZPlot plot);
 
    /**
     * Selects an appropriate tick size and format for the axis based on
     * the axis being rendered from <code>pt0</code> to <code>pt1</code>.
     * 
     * @param g2  the graphics target.
     * @param pt0  the starting point.
     * @param pt1  the ending point.
     * @param opposingPt  a point on the opposite side of the axis from the 
     *     labels.
     * 
     * @return The tick size.
     */
    double selectTick(Graphics2D g2, Point2D pt0, Point2D pt1, 
            Point2D opposingPt);
    
    List<TickData> generateTickData(double tickUnit);

}