import org.eclipse.jetty.server.*
import org.eclipse.jetty.server.handler.*
import org.eclipse.jetty.server.nio.SelectChannelConnector
import java.awt.Desktop

class SimpleServer {
    int port = 8080
    String indexFile = 'presentation.html'
    String resourceBase = 'build/asciidoc/html'

    def run() {
    	def resource_handler = new ResourceHandler(
		welcomeFiles: [indexFile] as String[],
    		resourceBase: resourceBase
	)
    	def handlers = new HandlerList(handlers: [resource_handler, new DefaultHandler()] as Handler[])
    	Server server = new Server(handler: handlers)
    	server.addConnector(new SelectChannelConnector(port: port))
	
    	server.start()
	println "Jetty listening on port $port"
	def url = "http://localhost:${port}/"
	Desktop.desktopSupported ? Desktop.desktop.browse(new URI(url)) : Runtime.runtime.exec("xdg-open $url")
    	server.join()
    }
}
