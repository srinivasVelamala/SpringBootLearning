package com.restexample.restsample;

import com.restexample.restsample.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId) {
        //return new CloudVendor("C1", "Vedor 1",
               // "Address1", "947747474");
        return cloudVendor;
    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor newVendor)
    {
        this.cloudVendor = newVendor;
        return "Cloud Vendor created successfully...";
    }

}
