package reggie.model;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.stereotype.Component;

@Component
public class VideoResourceProcessor implements ResourceProcessor<Resource<Video>> {

    private static final String YOU_TUBE_TEMPLATE = "http://youtube.com/watch?v=%s";

    @Override
    public Resource<Video> process(Resource<Video> resource) {
        Video video = resource.getContent();
        resource.add(new Link(String.format(YOU_TUBE_TEMPLATE, video.getYouTubeId()), "youTube"));
        return resource;
    }

}
