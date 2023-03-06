package factory;

import io.appium.java_client.remote.options.BaseOptions;

public interface ICapabilities<CAPABILITIES extends BaseOptions<CAPABILITIES>> {
      CAPABILITIES getConfigCapabilities();
}
