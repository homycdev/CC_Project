package grammatics;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OLangParser}.
 */
public interface OLangListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link OLangParser#classDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterClassDeclaration(OLangParser.ClassDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link OLangParser#classDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitClassDeclaration(OLangParser.ClassDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link OLangParser#className}.
     *
     * @param ctx the parse tree
     */
    void enterClassName(OLangParser.ClassNameContext ctx);

    /**
     * Exit a parse tree produced by {@link OLangParser#className}.
     *
     * @param ctx the parse tree
     */
    void exitClassName(OLangParser.ClassNameContext ctx);

    /**
     * Enter a parse tree produced by {@link OLangParser#memberDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterMemberDeclaration(OLangParser.MemberDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link OLangParser#memberDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitMemberDeclaration(OLangParser.MemberDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link OLangParser#variableDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterVariableDeclaration(OLangParser.VariableDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link OLangParser#variableDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitVariableDeclaration(OLangParser.VariableDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link OLangParser#methodDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterMethodDeclaration(OLangParser.MethodDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link OLangParser#methodDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitMethodDeclaration(OLangParser.MethodDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link OLangParser#parameters}.
     *
     * @param ctx the parse tree
     */
    void enterParameters(OLangParser.ParametersContext ctx);

    /**
     * Exit a parse tree produced by {@link OLangParser#parameters}.
     *
     * @param ctx the parse tree
     */
    void exitParameters(OLangParser.ParametersContext ctx);

    /**
     * Enter a parse tree produced by {@link OLangParser#parameterDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterParameterDeclaration(OLangParser.ParameterDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link OLangParser#parameterDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitParameterDeclaration(OLangParser.ParameterDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link OLangParser#body}.
     *
     * @param ctx the parse tree
     */
    void enterBody(OLangParser.BodyContext ctx);

    /**
     * Exit a parse tree produced by {@link OLangParser#body}.
     *
     * @param ctx the parse tree
     */
    void exitBody(OLangParser.BodyContext ctx);

    /**
     * Enter a parse tree produced by {@link OLangParser#constructorDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterConstructorDeclaration(OLangParser.ConstructorDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link OLangParser#constructorDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitConstructorDeclaration(OLangParser.ConstructorDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link OLangParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterStatement(OLangParser.StatementContext ctx);

    /**
     * Exit a parse tree produced by {@link OLangParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitStatement(OLangParser.StatementContext ctx);

    /**
     * Enter a parse tree produced by {@link OLangParser#assignment}.
     *
     * @param ctx the parse tree
     */
    void enterAssignment(OLangParser.AssignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link OLangParser#assignment}.
     *
     * @param ctx the parse tree
     */
    void exitAssignment(OLangParser.AssignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link OLangParser#whileLoop}.
     *
     * @param ctx the parse tree
     */
    void enterWhileLoop(OLangParser.WhileLoopContext ctx);

    /**
     * Exit a parse tree produced by {@link OLangParser#whileLoop}.
     *
     * @param ctx the parse tree
     */
    void exitWhileLoop(OLangParser.WhileLoopContext ctx);

    /**
     * Enter a parse tree produced by {@link OLangParser#ifStatement}.
     *
     * @param ctx the parse tree
     */
    void enterIfStatement(OLangParser.IfStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link OLangParser#ifStatement}.
     *
     * @param ctx the parse tree
     */
    void exitIfStatement(OLangParser.IfStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link OLangParser#returnStatement}.
     *
     * @param ctx the parse tree
     */
    void enterReturnStatement(OLangParser.ReturnStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link OLangParser#returnStatement}.
     *
     * @param ctx the parse tree
     */
    void exitReturnStatement(OLangParser.ReturnStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link OLangParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterExpression(OLangParser.ExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link OLangParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitExpression(OLangParser.ExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link OLangParser#arguments}.
     *
     * @param ctx the parse tree
     */
    void enterArguments(OLangParser.ArgumentsContext ctx);

    /**
     * Exit a parse tree produced by {@link OLangParser#arguments}.
     *
     * @param ctx the parse tree
     */
    void exitArguments(OLangParser.ArgumentsContext ctx);

    /**
     * Enter a parse tree produced by {@link OLangParser#primary}.
     *
     * @param ctx the parse tree
     */
    void enterPrimary(OLangParser.PrimaryContext ctx);

    /**
     * Exit a parse tree produced by {@link OLangParser#primary}.
     *
     * @param ctx the parse tree
     */
    void exitPrimary(OLangParser.PrimaryContext ctx);
}