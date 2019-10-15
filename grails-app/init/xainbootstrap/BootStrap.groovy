package xainbootstrap

class BootStrap {

    def init = { servletContext ->
        println 'BootStrap.init is running...'
    }
    def destroy = {
    }
}
