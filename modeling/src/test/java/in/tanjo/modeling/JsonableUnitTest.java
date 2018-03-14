package in.tanjo.modeling;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import in.tanjo.modeling.extension.JsonableUtils;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class JsonableUnitTest {
    @Test
    public void toJson() throws Exception {
        assertThat(JsonableUtils.toJson(new Hoge()), is("{}"));
    }

    class Hoge implements Jsonable {

        @NotNull
        @Override
        public JSONObject toJsonObject() {
            return new JSONObject();
        }
    }
}