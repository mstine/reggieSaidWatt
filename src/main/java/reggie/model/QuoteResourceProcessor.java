package reggie.model;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.stereotype.Component;

@Component
public class QuoteResourceProcessor implements ResourceProcessor<Resource<Quote>> {

    private static final String LOOPER_TEMPLATE = "http://www.infinitelooper.com/?v=%s&p=n#/%d;%d";

    @Override
    public Resource<Quote> process(Resource<Quote> resource) {
        Quote quote = resource.getContent();
        resource.add(new Link(String.format(LOOPER_TEMPLATE,
                quote.getVideo().getYouTubeId(),
                quote.getStartTime(),
                quote.getEndTime()),
                "infiniteLooper"));
        return resource;
    }

}
