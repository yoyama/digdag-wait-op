package io.github.yoyama.digdag.ops.wait;

import com.google.inject.Module;
import com.google.inject.Binder;
import com.google.inject.Scopes;
import com.google.inject.multibindings.Multibinder;

import io.digdag.spi.Extension;
import io.digdag.spi.OperatorFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class WaitOperatorExtension
        implements Extension {
    private static Logger logger = LoggerFactory.getLogger(WaitOperatorExtension.class);

    @Override
    public List<Module> getModules()
    {
        return Arrays.asList(new WaitOperatorModule());
    }

    public static class WaitOperatorModule
            implements Module
    {
        @Override
        public void configure(Binder binder)
        {
            logger.debug("WaitOperatorModule is loaded");
            Multibinder.newSetBinder(binder, OperatorFactory.class)
                    .addBinding().to(WaitOperatorFactory.class).in(Scopes.SINGLETON);
        }
    }
}
