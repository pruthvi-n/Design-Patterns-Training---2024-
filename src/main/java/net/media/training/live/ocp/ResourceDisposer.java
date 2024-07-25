package net.media.training.live.ocp;

public class ResourceDisposer {
    public void free(Resource resource, int resourceId) {
        resource.free(resourceId);
    }
}
