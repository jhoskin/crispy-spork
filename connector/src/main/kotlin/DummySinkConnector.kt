package connector

import org.apache.kafka.common.config.Config
import org.apache.kafka.common.config.ConfigDef
import org.apache.kafka.connect.connector.ConnectorContext
import org.apache.kafka.connect.connector.Task
import org.apache.kafka.connect.sink.SinkConnector

public class DummyConnector : SinkConnector()
{
    override fun validate(connectorConfigs: MutableMap<String, String>?): Config {
        return super.validate(connectorConfigs)
    }

    override fun taskConfigs(maxTasks: Int): MutableList<MutableMap<String, String>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun start(props: MutableMap<String, String>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun stop() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun version(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun taskClass(): Class<out Task> {
        return DummySinkTask::class.java
    }

//    override fun reconfigure(props: MutableMap<String, String>?) {
//        super.reconfigure(props)
//    }
//
//    override fun initialize(ctx: ConnectorContext?) {
//        super.initialize(ctx)
//    }
//
//    override fun initialize(ctx: ConnectorContext?, taskConfigs: MutableList<MutableMap<String, String>>?) {
//        super.initialize(ctx, taskConfigs)
//    }

    override fun config(): ConfigDef {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
