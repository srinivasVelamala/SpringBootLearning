package myapps.kafkasample.springboot.kafka.tutorial.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic javaguidesTopic(){
        return TopicBuilder.name("nivasjavaguides")
                .build();
    }
    @Bean
    public NewTopic jsonGuidesTopic(){
        return TopicBuilder.name("jsonguides")
                .build();
    }
}
