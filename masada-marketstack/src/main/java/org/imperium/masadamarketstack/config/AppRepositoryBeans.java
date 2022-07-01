package org.imperium.masadamarketstack.config;

import org.imperium.masadamarketstack.data.repo.*;
import org.imperium.masadamarketstack.data.services.impl.*;
import org.imperium.masadamarketstack.data.services.interfaces.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackageClasses = {
        EndOfDayRepository.class, DividendRepository.class,
        ExchangeRepository.class, IntradayRepository.class,
        SplitRepository.class, TickerRepository.class,
        TimezoneRepository.class
})
public class AppRepositoryBeans {

    @Bean
    public EndOfDayService endOfDayService(EndOfDayRepository repository) {
        return new EndOfDayServiceImpl(repository);
    }

    @Bean
    public DividendService dividendService(DividendRepository repository) {
        return new DividendServiceImpl(repository);
    }

    @Bean
    public ExchangeService exchangeService(ExchangeRepository repository) {
        return new ExchangeServiceImpl(repository);
    }

    @Bean
    public IntradayService intradayService(IntradayRepository repository) {
        return new IntradayServiceImpl(repository);
    }

    @Bean
    public SplitService splitService(SplitRepository repository) {
        return new SplitServiceImpl(repository);
    }

    @Bean
    public TickerService tickerService(TickerRepository repository) {
        return new TickerServiceImpl(repository);
    }

    @Bean
    public TimezoneService timezoneService(TimezoneRepository repository) {
        return new TimezoneServiceImpl(repository);
    }

}
