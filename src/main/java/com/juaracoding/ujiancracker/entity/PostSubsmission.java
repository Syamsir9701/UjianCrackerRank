
package com.juaracoding.ujiancracker.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class PostSubsmission implements Serializable, Parcelable
{

    @SerializedName("language_id")
    @Expose
    private Long languageId;
    @SerializedName("source_code")
    @Expose
    private String sourceCode;
    @SerializedName("stdin")
    @Expose
    private String stdin;
    public final static Creator<PostSubsmission> CREATOR = new Creator<PostSubsmission>() {


        @SuppressWarnings({
            "unchecked"
        })
        public PostSubsmission createFromParcel(android.os.Parcel in) {
            return new PostSubsmission(in);
        }

        public PostSubsmission[] newArray(int size) {
            return (new PostSubsmission[size]);
        }

    }
    ;
    private final static long serialVersionUID = 9216938177608200327L;

    protected PostSubsmission(android.os.Parcel in) {
        this.languageId = ((Long) in.readValue((Long.class.getClassLoader())));
        this.sourceCode = ((String) in.readValue((String.class.getClassLoader())));
        this.stdin = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public PostSubsmission() {
    }

    /**
     * 
     * @param sourceCode
     * @param stdin
     * @param languageId
     */
    public PostSubsmission(Long languageId, String sourceCode, String stdin) {
        super();
        this.languageId = languageId;
        this.sourceCode = sourceCode;
        this.stdin = stdin;
    }

    public Long getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Long languageId) {
        this.languageId = languageId;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String getStdin() {
        return stdin;
    }

    public void setStdin(String stdin) {
        this.stdin = stdin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PostSubsmission.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("languageId");
        sb.append('=');
        sb.append(((this.languageId == null)?"<null>":this.languageId));
        sb.append(',');
        sb.append("sourceCode");
        sb.append('=');
        sb.append(((this.sourceCode == null)?"<null>":this.sourceCode));
        sb.append(',');
        sb.append("stdin");
        sb.append('=');
        sb.append(((this.stdin == null)?"<null>":this.stdin));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.languageId == null)? 0 :this.languageId.hashCode()));
        result = ((result* 31)+((this.sourceCode == null)? 0 :this.sourceCode.hashCode()));
        result = ((result* 31)+((this.stdin == null)? 0 :this.stdin.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PostSubsmission) == false) {
            return false;
        }
        PostSubsmission rhs = ((PostSubsmission) other);
        return ((((this.languageId == rhs.languageId)||((this.languageId!= null)&&this.languageId.equals(rhs.languageId)))&&((this.sourceCode == rhs.sourceCode)||((this.sourceCode!= null)&&this.sourceCode.equals(rhs.sourceCode))))&&((this.stdin == rhs.stdin)||((this.stdin!= null)&&this.stdin.equals(rhs.stdin))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(languageId);
        dest.writeValue(sourceCode);
        dest.writeValue(stdin);
    }

    public int describeContents() {
        return  0;
    }

}
