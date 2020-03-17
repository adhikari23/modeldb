// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.diff.Function3;
import ai.verta.modeldb.versioning.blob.diff.*;
import ai.verta.modeldb.versioning.blob.visitors.Visitor;

public class CodeBlob implements ProtoType {
    public GitCodeBlob Git;
    public NotebookCodeBlob Notebook;

    public CodeBlob() {
        this.Git = null;
        this.Notebook = null;
    }

    public Boolean isEmpty() {
        if (this.Git != null) {
            return false;
        }
        if (this.Notebook != null) {
            return false;
        }
        return true;
    }

    // TODO: not consider order on lists
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof CodeBlob)) return false;
        CodeBlob other = (CodeBlob) o;

        {
            Function3<GitCodeBlob,GitCodeBlob,Boolean> f = (x, y) -> x.equals(y);
            if (this.Git != null || other.Git != null) {
                if (this.Git == null && other.Git != null)
                    return false;
                if (this.Git != null && other.Git == null)
                    return false;
                if (!f.apply(this.Git, other.Git))
                    return false;
            }
        }
        {
            Function3<NotebookCodeBlob,NotebookCodeBlob,Boolean> f = (x, y) -> x.equals(y);
            if (this.Notebook != null || other.Notebook != null) {
                if (this.Notebook == null && other.Notebook != null)
                    return false;
                if (this.Notebook != null && other.Notebook == null)
                    return false;
                if (!f.apply(this.Notebook, other.Notebook))
                    return false;
            }
        }
        return true;
    }

    public CodeBlob setGit(GitCodeBlob value) {
        this.Git = value;
        return this;
    }
    public CodeBlob setNotebook(NotebookCodeBlob value) {
        this.Notebook = value;
        return this;
    }

    static public CodeBlob fromProto(ai.verta.modeldb.versioning.CodeBlob blob) {
        if (blob == null) {
            return null;
        }

        CodeBlob obj = new CodeBlob();
        {
            Function<ai.verta.modeldb.versioning.CodeBlob,GitCodeBlob> f = x -> GitCodeBlob.fromProto(blob.getGit());
            obj.Git = Utils.removeEmpty(f.apply(blob));
        }
        {
            Function<ai.verta.modeldb.versioning.CodeBlob,NotebookCodeBlob> f = x -> NotebookCodeBlob.fromProto(blob.getNotebook());
            obj.Notebook = Utils.removeEmpty(f.apply(blob));
        }
        return obj;
    }

    public ai.verta.modeldb.versioning.CodeBlob.Builder toProto() {
        ai.verta.modeldb.versioning.CodeBlob.Builder builder = ai.verta.modeldb.versioning.CodeBlob.newBuilder();
        {
            if (this.Git != null) {
                Function<ai.verta.modeldb.versioning.CodeBlob.Builder,Void> f = x -> { builder.setGit(this.Git.toProto()); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.Notebook != null) {
                Function<ai.verta.modeldb.versioning.CodeBlob.Builder,Void> f = x -> { builder.setNotebook(this.Notebook.toProto()); return null; };
                f.apply(builder);
            }
        }
        return builder;
    }

    public void preVisitShallow(Visitor visitor) throws ModelDBException {
        visitor.preVisitCodeBlob(this);
    }

    public void preVisitDeep(Visitor visitor) throws ModelDBException {
        this.preVisitShallow(visitor);
        visitor.preVisitDeepGitCodeBlob(this.Git);
        visitor.preVisitDeepNotebookCodeBlob(this.Notebook);
    }

    public CodeBlob postVisitShallow(Visitor visitor) throws ModelDBException {
        return visitor.postVisitCodeBlob(this);
    }

    public CodeBlob postVisitDeep(Visitor visitor) throws ModelDBException {
        this.Git = visitor.postVisitDeepGitCodeBlob(this.Git);
        this.Notebook = visitor.postVisitDeepNotebookCodeBlob(this.Notebook);
        return this.postVisitShallow(visitor);
    }
}
