package qword.spring.jokeapp.configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

//@Configuration
public class JokeConfiguration {

//    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
