package reggie.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import reggie.model.Video;

@RepositoryRestResource(collectionResourceRel = "videos", path = "videos")
public interface VideoRepository extends PagingAndSortingRepository<Video, Long> {
}
