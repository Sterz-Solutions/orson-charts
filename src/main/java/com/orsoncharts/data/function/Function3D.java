/* ============
 * Orson Charts
 * ============
 * 
 * (C)opyright 2013, 2014, by Object Refinery Limited.
 * 
 * http://www.object-refinery.com/orsoncharts/index.html
 * 
 * Redistribution of these source files is prohibited.
 * 
 */

package com.orsoncharts.data.function;

import java.io.Serializable;
import com.orsoncharts.Range;
import com.orsoncharts.data.xyz.XYZDatasetUtils;

/**
 * Represents a function <code>y = f(x, z)</code>.  
 * <br><br>
 * A dataset can be created by sampling a function - see the 
 * {@link XYZDatasetUtils#sampleFunction(Function3D, String, Range, double, Range, double)} 
 * method.  In addition, any <code>Function3D</code> instance can be plotted
 * by a {@link com.orsoncharts.renderer.xyz.SurfaceRenderer}.
 */
public interface Function3D extends Serializable {
    
    /**
     * Returns the value of the function ('y') for the specified inputs ('x' 
     * and 'z').
     *
     * @param x  the x-value.
     * @param z  the z-value.
     *
     * @return The function value.
     */
    public double getValue(double x, double z);
   
}
