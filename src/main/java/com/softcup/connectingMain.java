package com.softcup.service.impl;

import com.softcup.domain.CommonDomain;

import java.math.BigInteger;
import java.util.List;

public class connectingMain {
    /* This is a simple pseudocode about the connecting flight algorithm */

    //CommonDomain route[times]; the route
    //CommonDomain output[n][times]; There are n results, to print. Every result has less than 8 transfer cities.

    public static void main(String[] args){
        /* null */
    }

    public int getTimes(connectingMain route[]){
        int times=1; //example
        /* get the number of transfers*/
        return times;
    }

    int MaxTime=10; //This means choosing ten routes between city A and city B.
    /* Insure about 1000~2000 routes for every search
    [times,MaxTime]={
        [1,1000],[2,32],[3,10],[4,6],[5,4],[6,3],[7,3],[8,2]
     }
     */

    public List<CommonDomain> getOneWay(/*CommonDomain output[], int rp ,String departure, String arrival, String departureDate, String proxy*/){
        /* oneWayService, according to departure, arrival, departureDate, proxy
        * output[rp]=the first route;
        * output[rp+1]=the second route;
        * output[rp+2]=the third route;
        * ......
        * output[rp+MaxTime]=the final route;
        *
        * return output[] */
        return null; //return a list, not 'null'
    }

    public void getWay(connectingMain route[],int times){
        /* main */
        /*
        getOneWay(output[], 0, route[0].departure, route[1].departure, route[0]departureDate, proxy);
        int i=0;
        int top =MaxTime;

        while(!output[i] && i<top){
            getOneWay(output[], top, route[0].departure, route[1].departure, route[0]departureDate+120min, proxy);
            top+=MaxTime;
            i++;
        }

        sort output[];
        */
    }

}
