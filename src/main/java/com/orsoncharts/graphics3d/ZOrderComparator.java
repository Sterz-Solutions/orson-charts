/* ============
 * Orson Charts
 * ============
 * 
 * (C)opyright 2013, by Object Refinery Limited.
 * 
 */

package com.orsoncharts.graphics3d;

import java.util.Comparator;

/**
 * A comparator that orders {@link Face} instances by Z-order.
 */
public class ZOrderComparator implements Comparator {

    Point3D[] pts;
    
    /**
     * Creates a new comparator.
     * 
     * @param pts  the points. 
     */
    public ZOrderComparator(Point3D[] pts) {
        this.pts = pts;
    }
    
    /* (non-Javadoc)
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    @Override
    public int compare(Object obj1, Object obj2) {
        Face f1 = (Face) obj1;
        Face f2 = (Face) obj2;
        double z1 = f1.calculateAverageZValue(this.pts);
        double z2 = f2.calculateAverageZValue(this.pts);
        if (z1 > z2) {
            return 1;
        }
        else if (z2 > z1) {
            return -1;
        }
        else return 0;
    }
   
}
