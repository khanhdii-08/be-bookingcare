package com.iuh.bookingcare.web.rest;

import com.iuh.bookingcare.config.ConfigServerProperties;
import com.iuh.bookingcare.web.rest.vm.CloudConfigVM;
import org.springframework.cloud.config.client.ConfigClientProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for viewing Spring Cloud Config bootstrap configuration.
 */
@RestController
@RequestMapping("/api")
public class CloudConfigResource {

    private final ConfigClientProperties configClientProperties;

    private final ConfigServerProperties configServerProperties;

    public CloudConfigResource(ConfigClientProperties configClientProperties, ConfigServerProperties configServerProperties) {
        this.configClientProperties = configClientProperties;
        this.configServerProperties = configServerProperties;
    }

    /**
     * GET  /config/sources : get the various configuration sources
     */
    @GetMapping("/config/sources")
    public ResponseEntity<CloudConfigVM> sources() {
        CloudConfigVM cloudConfigVM = new CloudConfigVM(configClientProperties.getLabel(), configServerProperties.getComposite());
        return new ResponseEntity<>(cloudConfigVM, HttpStatus.OK);
    }
}
