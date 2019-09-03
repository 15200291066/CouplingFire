package org.couplingfire.registry;

/**
 * @version 1.0.1
 * @auto jerry lee
 * @date 2019/9/3
 */
public class RemoteRegistionInfo {
    private String remoteApplicationName;
    private String remoteUrl;
    private String rigionName;

    public RemoteRegistionInfo(String remoteApplicationName, String remoteUrl, String rigionName) {
        this.remoteApplicationName = remoteApplicationName;
        this.remoteUrl = remoteUrl;
        this.rigionName = rigionName;
    }

    public RemoteRegistionInfo(RemoteRegistionInfo registionInfo) {
        this.remoteApplicationName = registionInfo.getRemoteApplicationName();
        this.remoteUrl = registionInfo.getRemoteUrl();
        this.rigionName = registionInfo.getRigionName();
    }

    public String getRemoteApplicationName() {
        return remoteApplicationName;
    }

    public void setRemoteApplicationName(String remoteApplicationName) {
        this.remoteApplicationName = remoteApplicationName;
    }

    public String getRemoteUrl() {
        return remoteUrl;
    }

    public void setRemoteUrl(String remoteUrl) {
        this.remoteUrl = remoteUrl;
    }

    public String getRigionName() {
        return rigionName;
    }

    public void setRigionName(String rigionName) {
        this.rigionName = rigionName;
    }
}
