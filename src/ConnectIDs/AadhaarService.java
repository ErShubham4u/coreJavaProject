package ConnectIDs;

import java.util.HashMap;
import java.util.Map;

public class AadhaarService {
    private static Map<String,Aadhaar> aadhaarMap=new HashMap<>();
    static {
        aadhaarMap.put("1232332234",new Aadhaar("1232332234",
                "Anil","Mr Sunil Kumar","Agra"));
        aadhaarMap.put("1232332236",new Aadhaar("1232332236",
                "Suresh","Mr Mahesh ji","Delhi"));
    }

    public Aadhaar getAadhaarByNumber(String aadhaarNumber)
    {
        return aadhaarMap.get(aadhaarNumber);
    }
}
