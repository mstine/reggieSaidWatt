package reggie.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import reggie.model.Quote;

@RepositoryRestResource(collectionResourceRel = "quotes", path = "quotes")
public interface QuoteRepository extends PagingAndSortingRepository<Quote, Long> {
}
