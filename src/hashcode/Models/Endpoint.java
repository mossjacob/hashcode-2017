package hashcode.Models;

import java.util.HashMap;
import java.util.Map;

public class Endpoint
{
    //cacheServerIndex, latencyToDataCenter
    private Map<Integer, Integer> map;
    private int latencyToDataCenter;

    public Endpoint(int latencyToDataCenter)
    {
        map = new HashMap<>();
        this.latencyToDataCenter = latencyToDataCenter;
    }

    public void addCacheServer(int id, int latency)
    {
        map.put(id, latency);
    }
}